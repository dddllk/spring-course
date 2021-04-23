package com.dlkyy.service.impl;

import com.dlkyy.service.SomeService;

import java.util.Date;

/**
 * Created by dlkyy on 2021/4/23 20:00
 */
public class SomeServiceImpl implements SomeService {
  @Override
  public void doSome() {
    System.out.println("执行时间：" + new Date());
    System.out.println("doSome");
  }

  @Override
  public void doOther() {
    System.out.println("执行时间：" + new Date());
    System.out.println("doOther");
  }
}
