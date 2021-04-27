package com.dlkyy;

import com.dlkyy.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dlkyy on 2021/4/27 21:29
 */
public class MyTest {
  @Test
  public void test01(){
    String config = "applicationContext.xml";
    ApplicationContext ac = new ClassPathXmlApplicationContext(config);
    BuyGoodsService buyGoodsService = (BuyGoodsService) ac.getBean("buyService");

    buyGoodsService.buy(1003, 10);
  }
}
