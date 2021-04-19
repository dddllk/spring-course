package com.dlkyy;

import com.dlkyy.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/17 17:44
 */
public class MyTest {
  @Test
  public void test01(){
    String config = "ba01/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    // 从容器中获取student对象
    Student student = (Student) ac.getBean("student");

    System.out.println("student= "+ student);
  }

  @Test
  public void test02(){
      String config = "ba02/applicationContext.xml";
      ApplicationContext ac = new ClassPathXmlApplicationContext(config);
      // student school对象
      Student student = (Student) ac.getBean("student");
      System.out.println("Student对象="+student);
  }

  @Test
  public void test03(){
    String config = "ba03/applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);

    Student student = (Student) ac.getBean("student");
    System.out.println("student = "+ student);
  }
}
