package com.dlkyy;

import com.dlkyy.ba04.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/26 20:45
 */
public class AppTest04 {
  @Test
  public void test01(){
    String config = "ba04/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    // 从容器中获取目标对象
    SomeService proxy = (SomeService) ac.getBean("someService");

    proxy.doSecond("dlk", 19);

  }
}
