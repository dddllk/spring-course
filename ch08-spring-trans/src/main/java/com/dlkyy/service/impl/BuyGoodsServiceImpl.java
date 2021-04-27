package com.dlkyy.service.impl;

import com.dlkyy.dao.GoodsDao;
import com.dlkyy.dao.SaleDao;
import com.dlkyy.entity.Goods;
import com.dlkyy.entity.Sale;
import com.dlkyy.excep.NotEnoughException;
import com.dlkyy.service.BuyGoodsService;

/**
 * Created by dlkyy on 2021/4/27 21:10
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

  private SaleDao saleDao;
  private GoodsDao goodsDao;

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
