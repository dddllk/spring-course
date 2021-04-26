package com.dlkyy.ba04;

import com.dlkyy.ba02.Student;

/**
 * Created by dlkyy on 2021/4/25 21:24
 */
public interface SomeService {
  void doSome(String name, Integer age);
  String doOther(String name, Integer age);
  Student doOther2(String name, Integer age);
  String doFirst(String name, Integer age);
  void doSecond(String name, Integer age);
}
