package com.dlkyy.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dlkyy on 2021/4/19 22:19
 */
@Component("mySchool")
public class School {
  @Value("重庆邮电大学")
  private String name;
  @Value("重庆")
  private String address;

  public School() {
  }

  public School(String name, String address) {
    this.name = name;
    this.address = address;
  }

  @Override
  public String toString() {
    return "School{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
