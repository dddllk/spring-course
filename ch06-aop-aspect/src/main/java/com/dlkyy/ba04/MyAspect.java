package com.dlkyy.ba04;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by dlkyy on 2021/4/26 20:34
 */

@Aspect
public class MyAspect {
  /**
   * 异常通知方法的定义格式：
   *  1.public
   *  2.没有返回值
   *  3.方法名称自定义
   *  4.方法有一个Exception参数，还有一个是JointPoint
   */

  /**
   * @AfterThrowing：异常通知
   *  属性：1.value 切入点表达式
   *       2.throwing 自定义的变量，表示目标方法抛出的异常对象。
   *         变量名必须和方法的参数名一样。
   *  特点：
   *  1.在目标方法抛出异常的时候执行
   *  2.可以做异常的监控程序，监控目标方法执行是不是有异常。
   *    如果有异常，可以发送邮件，短信进行通知。
   */
  @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
      throwing = "ex")
  public void myAfterThrowing(Exception ex){
    System.out.println("异常通知：方法发生异常时，执行：" +ex.getMessage());
  }
}
