package com.dlkyy;

import com.dlkyy.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/25 22:27
 */

public class AppTest03 {
  @Test
  public void test01(){
    String config = "ba03/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    // 从容器中获取目标对象
    SomeService proxy = (SomeService) ac.getBean("someService");

    String str = proxy.doFirst("dlkyy", 26);

  }
}
