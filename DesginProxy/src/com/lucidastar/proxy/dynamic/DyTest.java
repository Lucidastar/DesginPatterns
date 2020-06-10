package com.lucidastar.proxy.dynamic;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;

public class DyTest {
    public static void main(String[] args) {
//        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject subject = new SubjectImp();
        Subject subject1 = new SubjectImpOne();

        Subject subjectProxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new SubjectProxy(subject));
        System.out.println("代理产生的className-》"+subjectProxy.getClass().getName());
        subjectProxy.say("hello");
        Class<?> proxyClass = Proxy.getProxyClass(Subject.class.getClassLoader(), Subject.class);

        Method[] methods = proxyClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());

        }

        try {

            Class<SubjectImp> clazz = SubjectImp.class;
            SubjectImp subjectImp = clazz.newInstance();
            Method method = clazz.getMethod("say", String.class);
            method.invoke(subjectImp,"hellllll");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


        try {
            subject.getClass().getMethod("say", String.class).invoke(subject,"你好");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
