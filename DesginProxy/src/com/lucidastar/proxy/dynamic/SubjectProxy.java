package com.lucidastar.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {

    private Subject mSubject;

    public SubjectProxy(Subject subject) {
        mSubject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("say")){//
            System.out.println("这是做一些操作，而不需要修改Subject的实现");
        }
        System.out.println("方法中的proxy"+proxy.getClass().getName());
        return method.invoke(mSubject,args);
    }
}
