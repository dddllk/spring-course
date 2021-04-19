package com.dlkyy.ba05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dlkyy on 2021/4/19 21:15
 *
 * @Component: 创建对象的，等同于<bean>的功能
 *      属性：value就是对象的名称，也就是bean的id值
 *            value的值是惟一的，创建的对象在spring容器中就一个
 *      位置：在类的上面
 *
 *      @Component(value = "myStudent") 等同于
 *        <bean id="myStudent" class="com.dlkyy.ba01.Student"></bean>
 *
 *      spring中和@Component功能一致，创建对象的注解还有：
 *        1.@Repository（用在持久层类的上面）：放在dao类的上面，
 *                表示创建dao对象，到对象是能访问数据库的。
 *        2.@Service（用在业务层类的上面）：放在service的实现类上面，
 *                表示创建service对象service对象是做业务处理，可以有事务等功能
 *        3.@Controller（用在控制器的上面）：放在控制器（处理器）类的上面，创建控制器对象的，
 *                控制器对象，能够接受用户提交的参数，显示请求的处理结果。
 *        以上三个租借的使用语法和@Component是一样的。都能创建对象，但是这个三个注解还有额外的功能。
 */
@Component(value = "myStudent")
public class Student {
  @Value("dlkyy")
  private String name;
  @Value("26")
  private Integer age;

  /**
   * 引用类型赋值：
   * @Autowired： spring框架提供的注解，实现应用类型的赋值
   *  spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byName,byType
   * @Autowired: 默认使用的是byType自动注入
   *
   *  属性：required，是一个boolean类型的，默认true
   *        required=false，表示引用类型赋值失败，程序报错，并中止执行
   *        required=true，表示引用类型赋值失败，程序正常执行，引用类型是null
   *
   *  位置：1）在属性定义的上面
   *        2）在set方法的上面
   *
   *  如果使用byName的方式，需要做的是：
   *    1.在属性上面加入@Autowired
   *    2.在属性上面加入@Qualifier(value="bean的id"):表示使用指定名称的bean完成赋值
   */
  @Autowired
  @Qualifier("mySchool")
  private School school;

  public Student() {
  }

  public Student(String name, Integer age, School school) {
    this.name = name;
    this.age = age;
    this.school = school;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", school=" + school +
        '}';
  }
}
