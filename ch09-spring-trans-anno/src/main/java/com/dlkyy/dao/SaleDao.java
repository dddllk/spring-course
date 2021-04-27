package com.dlkyy.dao;

import com.dlkyy.entity.Sale;

/**
 * Created by dlkyy on 2021/4/27 20:55
 */
public interface SaleDao {
  // 增加销售记录
  int insertSale(Sale sale);
}
