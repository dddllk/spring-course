package com.dlkyy;

import com.dlkyy.ba02.SomeService;
import com.dlkyy.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/25 21:46
 */
public class AppTest02 {

  @Test
  public void test02(){
    String config = "ba02/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    // 从容器中获取目标对象
    SomeService proxy = (SomeService) ac.getBean("someService");

    String str = proxy.doOther("dlkyy", 26);

    System.out.println("str = " + str);
  }
  @Test
  public void test03(){
    String config = "ba02/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    // 从容器中获取目标对象
    SomeService proxy = (SomeService) ac.getBean("someService");

    Student student = proxy.doOther2("dlkyy", 26);

    System.out.println(student);
  }
}
