package com.dlkyy.service.impl;

import com.dlkyy.dao.GoodsDao;
import com.dlkyy.dao.SaleDao;
import com.dlkyy.entity.Goods;
import com.dlkyy.entity.Sale;
import com.dlkyy.excep.NotEnoughException;
import com.dlkyy.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by dlkyy on 2021/4/27 21:10
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

  private SaleDao saleDao;
  private GoodsDao goodsDao;

  /**
   *
   *
   * rollbackFor: 表示发生指定的异常一定回滚
   *  处理逻辑是：
   *    1）spring框架会首先检查方法抛出的异常是不是在rollbackFor的属性值中
   *        如果异常在rollbackFor列表中，不管是什么类型的异常，一定会回滚
   *    2）如果你抛出的异常不在rollbackFor列表中，spring会判断异常是不是RuntimeException，
   *        如果是，一定回滚。
   */
  // @Transactional(
  //     propagation = Propagation.REQUIRED,
  //     isolation = Isolation.DEFAULT,
  //     readOnly = false,
  //     rollbackFor = {
  //         NullPointerException.class,
  //         NotEnoughException.class
  //     }
  // )
  @Transactional
  // 以上两种都可以
  // 使用的是事务的默认值，默认的传播行为是REQUIRED，默认隔离级别DEFAULT
  // 默认抛出运行时异常，回滚事务
  // 注解通常加在你要有事务的公用方法上
  @Override
  public void buy(Integer goodsId, Integer nums) {
    System.out.println("bug begin------");
    // 记录销售信息，向sale表添加记录
    int count = saleDao.insertSale(new Sale(null, goodsId, nums));
    // 更新库存
    Goods goods = goodsDao.selectGoods(goodsId);
    if(goods == null) {
      // 商品不存在
      throw new NullPointerException("编号是：" + goodsId + "商品不存在");
    }else if (goods.getAmount() < nums) {
      // 库存商品不足
      throw new NotEnoughException("编号是：" + goodsId + "商品库存不足");
    }
    // 修改库存
    Goods buyGoods = new Goods();
    buyGoods.setId(goodsId);
    buyGoods.setAmount(nums);

    goodsDao.updateGoods(buyGoods);

    System.out.println("buy end-------");
  }

  public void setSaleDao(SaleDao saleDao) {
    this.saleDao = saleDao;
  }

  public void setGoodsDao(GoodsDao goodsDao) {
    this.goodsDao = goodsDao;
  }
}
