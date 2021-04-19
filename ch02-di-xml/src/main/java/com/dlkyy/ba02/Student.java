package com.dlkyy.ba02;

/**
 * Created by dlkyy on 2021/4/17 17:39
 */
public class Student {
  private String name;
  private Integer age;
  private School school;

  public Student(){
    System.out.println("spring调用无参数构造方法创建对象");
  }
  /**
   * 需要有set方法，没有的话会报错
   * @param name
   */
  public void setName(String name) {
    System.out.println("name=" + name);
    this.name = name;
  }

  public void setAge(Integer age) {
    System.out.println("age=" + age);
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
