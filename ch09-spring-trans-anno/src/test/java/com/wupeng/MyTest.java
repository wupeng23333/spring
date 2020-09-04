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
        BuyGoodsService service= (BuyGoodsService) ac.getBean("buyGoodsService");
        System.out.println(service.getClass().getName());
        service.buy(1001,1000);
    }
}
