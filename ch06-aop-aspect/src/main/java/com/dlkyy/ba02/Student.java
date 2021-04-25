package com.dlkyy.ba02;

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
  private String name;
  private Integer age;

  public Student() {
  }

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
