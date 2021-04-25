package com.dlkyy.ba02;

/**
 * Created by dlkyy on 2021/4/25 21:25
 */
public class SomeServiceImpl implements SomeService{
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
}
