package com.dlkyy.handle;

import com.dlkyy.service.SomeService;
import com.dlkyy.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dlkyy on 2021/4/23 20:43
 */
public class MyInvocationHandler implements InvocationHandler {

  //目标对象
  private Object target; //SomeServiceImpl类

  public MyInvocationHandler(Object target){
    this.target = target;
  }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("执行了Invoke方法！");
    System.out.println("method:" + method.getName() + "()方法执行！");
    //通过代理对象执行方法时，会调用执行这个invoke()
    Object res = null;

    // 输出日志
    ServiceTools.doLog();

    //执行目标类的方法，通过Method类实现
    res = method.invoke(target, args);

    // 提交事务
    ServiceTools.doTrans();
    // 返回目标方法执行结果
    return res;
  }
}
