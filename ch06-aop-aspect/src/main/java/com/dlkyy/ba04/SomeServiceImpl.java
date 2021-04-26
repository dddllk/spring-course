package com.dlkyy.ba04;

import com.dlkyy.ba02.Student;

/**
 * Created by dlkyy on 2021/4/25 21:25
 */
public class SomeServiceImpl implements SomeService {
  @Override
  public void doSome(String name, Integer age) {
    System.out.println("目标方法doSome()====");
  }

  @Override
  public String doOther(String name, Integer age) {
    System.out.println("目标方法Other()====");
    return "abcd";
  }

  @Override
  public Student doOther2(String name, Integer age) {
    Student student = new Student("dlkyy", 16);
    return student;
  }

  @Override
  public String doFirst(String name, Integer age) {
    System.out.println("业务方法doFirst()===>");
    return "doFirst";
  }

  @Override
  public void doSecond(String name, Integer age) {
    System.out.println("执行doSecond()"+(10/0));
  }
}
