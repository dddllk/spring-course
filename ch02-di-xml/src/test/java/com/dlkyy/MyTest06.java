package com.dlkyy;

import com.dlkyy.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/19 20:47
 */
public class MyTest06 {
  @Test
  public void test(){
    String config = "ba06/total.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    Student student = (Student) ac.getBean("student");
    System.out.println("student = "+ student);
  }
}
