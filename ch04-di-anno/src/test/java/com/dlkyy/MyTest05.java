package com.dlkyy;

import com.dlkyy.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 22:37
 */
public class MyTest05 {
  @Test
  public void test(){
    ApplicationContext act = new ClassPathXmlApplicationContext("ba05/applicationContext.xml");
    Student student = (Student) act.getBean("myStudent");
    System.out.println("student=" + student);
  }
}
