package com.dlkyy;

import com.dlkyy.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 22:03
 */
public class MyTest02 {
  @Test
  public void test(){
    String config = "ba02/applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    Student student = (Student) ctx.getBean("myStudent");
    System.out.println("student=" +student);
  }
}
