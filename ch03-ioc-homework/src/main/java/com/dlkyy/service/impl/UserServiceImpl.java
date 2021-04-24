package com.dlkyy.service.impl;

import com.dlkyy.dao.UserDao;
import com.dlkyy.domain.SysUser;
import com.dlkyy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dlkyy on 2021/4/19 19:41
 */
@Service("userService")
public class UserServiceImpl implements UserService {
  //引用类型，在xml文件给属性赋值，要求属性要有set方法
  // @Autowired
  // @Qualifier("mysqlDao")
  @Resource(name="mysqlDao")
  private UserDao dao = null;

  public void setDao(UserDao dao) {
    this.dao = dao;
  }

  @Override
  public void addUser(SysUser user) {
    dao.insertUser(user);
  }
}
