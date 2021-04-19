package com.dlkyy.ba04;

/**
 * Created by dlkyy on 2021/4/17 17:39
 */
public class Student {
  private String name;
  private Integer age;
  //引用类型
  private School school;

  public Student(){
    System.out.println("spring调用无参数构造方法创建对象");
  }

  public Student(String name, Integer age, School school) {
    this.name = name;
    this.age = age;
    this.school = school;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setSchool(School school) {
    this.school = school;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", school=" + school +
        '}';
  }

}
