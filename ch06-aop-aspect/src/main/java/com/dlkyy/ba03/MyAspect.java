package com.dlkyy.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * Created by dlkyy on 2021/4/25 22:14
 *
 * 环绕通知
 */
@Aspect
public class MyAspect {
  /**
   * 环绕通知方法的定义格式：
   * 1.public修饰
   * 2.必须有一个返回值，推荐使用Object
   * 3.方法名称自定义
   * 4.方法有参数，固定参数 ProceedingJoinPoint
   */

  /**
   *
   * @param pjp 等同于 jdk动态代理的 Method
   *            作用：执行目标方法的
   * @return 就是目标方法的执行结果，可以被修改
   *
   * @Around 环绕通知
   *  属性：value 切入点表达式
   *  位置：在方法定义的上面
   *特点：
   *  1.它是功能最强的通知
   *  2.在目标方法的前和后都能增强功能。
   *  3.控制目标方法是否被调用执行
   *  4.修改原来的目标方法的执行结果。影响最后的调用结果
   *
   *  环绕通知，等同于jdk动态代理的，InvocationHandler接口
   */
  // 包名、方法名不能写错，否则加不上环绕通知
  @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
  public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
    //实现环绕通知
    Object res = null;
    System.out.println("环绕通知：在目标方法之前，输出时间：" + new Date());
    //1.目标方法的调用
    res = pjp.proceed(); //method.invoke();
    System.out.println("环绕通知：在目标方法之后，提交事务");
    //2.在目标方法的前或者后加入功能
    // 返回目标方法执行结果
    return res;
  }
}
