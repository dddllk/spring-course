package com.dlkyy.ba04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dlkyy on 2021/4/19 22:19
 */
@Component("mySchool")
public class School {
  @Value("bjpowernode")
  private String name;
  @Value("bj")
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
