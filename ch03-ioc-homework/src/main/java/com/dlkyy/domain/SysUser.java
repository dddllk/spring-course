package com.dlkyy.domain;

/**
 * Created by dlkyy on 2021/4/19 19:39
 */
public class SysUser {
  private String name;
  private Integer age;

  public SysUser() {
  }

  public SysUser(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "SysUser{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
