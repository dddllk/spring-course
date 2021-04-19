package com.dlkyy;

import com.dlkyy.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 20:25
 */
public class MyTest05 {
  @Test
  public void test(){
    String config = "ba05/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    Student student = (Student) ac.getBean("student");
    System.out.println("student = "+ student);
  }
}
