package com.dlkyy.dao.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;

/**
 * Created by dlkyy on 2021/4/19 19:39
 */
public class UserDaoImpl implements UserDao {
  @Override
  public void insertUser(SysUser user) {
    System.out.println("user插入到mysql数据库中");
  }
}
