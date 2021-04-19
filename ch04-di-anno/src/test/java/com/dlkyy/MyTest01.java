package com.dlkyy;

import com.dlkyy.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 21:28
 */
public class MyTest01 {
  @Test
  public void test(){
    ApplicationContext act = new ClassPathXmlApplicationContext("ba01/applicationContext.xml");
    Student student = (Student) act.getBean("myStudent");
    System.out.println("student=" + student);
  }
}
