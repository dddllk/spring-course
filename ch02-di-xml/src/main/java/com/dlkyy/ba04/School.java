package com.dlkyy.ba04;

/**
 * Created by dlkyy on 2021/4/17 19:50
 */
public class School {
  private String address;
  private String name;

  public School() {
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "School{" +
        "address='" + address + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
