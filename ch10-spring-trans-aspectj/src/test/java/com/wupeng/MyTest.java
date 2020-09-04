package com.wupeng;

import com.wupeng.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void Test1(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);
        BuyGoodsService buy= (BuyGoodsService) ac.getBean("buyGoodsService");
        buy.buy(1001,10);
    }
}
