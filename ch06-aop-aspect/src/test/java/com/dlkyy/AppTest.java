package com.dlkyy;

import com.dlkyy.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test(){
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
        System.out.println("proxy= " + proxy.getClass().getName());
        // 通过代理的对象执行方法，实现目标方法执行时，增强了功能
        proxy.doSome("jq", 16);

    }

}
