package com.lucidastar.proxy.dynamic;

import java.lang.reflect.Proxy;

public class DyTest {
    public static void main(String[] args) {

        Subject subject = new SubjectImp();

        Subject subjectProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), new Class[]{Subject.class}, new SubjectProxy(subject));
        subjectProxy.say("hello");
    }
}
