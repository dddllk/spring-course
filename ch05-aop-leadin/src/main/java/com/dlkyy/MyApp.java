package com.dlkyy;

import com.dlkyy.handle.MyInvocationHandler;
import com.dlkyy.service.SomeService;
import com.dlkyy.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by dlkyy on 2021/4/23 20:02
 */
public class MyApp {
  public static void main(String[] args) {
    // SomeService someService = new SomeServiceImpl();
    // someService.doSome();
    // System.out.println("-----------");
    // someService.doOther();

    // 使用 jdk 的Proxy创建代理对象
    SomeService target = new SomeServiceImpl();

    // 创建InvocationHandler对象
    InvocationHandler handler = new MyInvocationHandler(target);

    // 使用Proxy创建代理
    SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
        target.getClass().getInterfaces(),
        handler);

    // 通过代理执行方法，会调用handler中的invoke()
    proxy.doSome();
  }
}
