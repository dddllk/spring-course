package com.dlkyy;

import com.dlkyy.dao.StudentDao;
import com.dlkyy.entity.Student;
import com.dlkyy.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dlkyy on 2021/4/26 22:12
 */
public class AppTest {
  @Test
  public void test01(){
    String config = "applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    String names[] = ctx.getBeanDefinitionNames();
    for(String name : names) {
      System.out.println("容器中对象的名称：" + name + "|" +ctx.getBean(name));
    }
  }

  @Test
  public void test02(){
    String config = "applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    StudentDao dao = (StudentDao) ctx.getBean("studentDao");
    Student student = new Student(null, "jq", "jq@126.com", 28);
    int nums = dao.insertStudent(student);
    System.out.println(nums);
  }

  @Test
  public void test03(){
    String config = "applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    StudentService studentService = (StudentService) ctx.getBean("studentService");
    Student student = new Student(null, "jq", "jq@126.com", 28);
    int nums = studentService.addStudent(student);
    // spring和mybatis整合在一起使用，事务是自动提交的。无需执行sqlSession.commit();
    System.out.println("nums = " +nums);
  }

  @Test
  public void test04(){
    String config = "applicationContext.xml";
    ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
    StudentService service = (StudentService) ctx.getBean("studentService");
    List<Student> stuList = service.queryStudents();
    for(Student student : stuList) {
      System.out.println(student);
    }
  }
}
