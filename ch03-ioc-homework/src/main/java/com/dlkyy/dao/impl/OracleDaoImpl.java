package com.dlkyy.dao.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;

/**
 * Created by dlkyy on 2021/4/19 20:00
 */
public class OracleDaoImpl implements UserDao {
  @Override
  public void insertUser(SysUser user) {
    System.out.println("Oracle数据库插入数据");
  }
}
