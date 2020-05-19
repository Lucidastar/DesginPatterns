package com.lucidastar.proxy.dynamic;

public class SubjectImp implements Subject {
    @Override
    public void say(String name) {
        System.out.println("这是接口的实现类->"+this.getClass().getName()+"====say->"+name);
    }
}
