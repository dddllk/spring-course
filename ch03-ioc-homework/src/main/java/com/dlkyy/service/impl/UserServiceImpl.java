package com.dlkyy.service.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;
import com.dlkyy.service.UserService;

/**
 * Created by dlkyy on 2021/4/19 19:41
 */
public class UserServiceImpl implements UserService {
  //引用类型，在xml文件给属性赋值，要求属性要有set方法
  private UserDao dao = null;

  public void setDao(UserDao dao) {
    this.dao = dao;
  }

  @Override
  public void addUser(SysUser user) {
    dao.insertUser(user);
  }
}
