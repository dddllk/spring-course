package com;

import com.dlkyy.domain.SysUser;
import com.dlkyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 19:53
 */
public class MyApp {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService service = (UserService) ctx.getBean("userService");
    service.addUser(new SysUser("dd", 17));
  }
}
