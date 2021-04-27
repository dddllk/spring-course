package com.dlkyy.dao;

import com.dlkyy.entity.Goods;

/**
 * Created by dlkyy on 2021/4/27 20:59
 */
public interface GoodsDao {
  // 更新库存
  int updateGoods(Goods goods);
  // 查询商品信息
  Goods selectGoods(Integer id);
}
