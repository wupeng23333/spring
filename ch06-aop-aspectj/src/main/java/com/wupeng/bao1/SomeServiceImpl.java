package com.wupeng.bao1;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("执行了doSome方法");
    }
}
