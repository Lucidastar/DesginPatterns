package com.lucidastar.proxy;

import com.lucidastar.proxy.statics.*;

import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    public static void main(String[] args) {
        System.out.println("代理模式");
        IvoryTower ivoryTower = new IvoryTower();
//        OtherTower otherTower = new OtherTower();
        WizardTower wizardTower = new IvoryTowerProxy(ivoryTower);
        wizardTower.enter(new Wizard("red wizard"));
        wizardTower.enter(new Wizard("black wizard"));
        wizardTower.enter(new Wizard("green wizard"));
        wizardTower.enter(new Wizard("pink wizard"));
//        testDynamic();

    }

    public static void testDynamic(){
        IvoryTower ivoryTower = new IvoryTower();
        WizardTower wizardTower = (WizardTower) Proxy.newProxyInstance(WizardTower.class.getClassLoader(), new Class[]{WizardTower.class}, new MyInvocationHandler(ivoryTower));
        wizardTower.enter(new Wizard("red wizard"));
        wizardTower.result();
        wizardTower.showName("hello");



//        System.out.println(wizardTower.getClass().getName());
    }

    static class MyInvocationHandler implements InvocationHandler{
        final Object obj;

        public MyInvocationHandler(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            System.out.println(name);
//            System.out.println("args = "+args[0].getClass().getName());
            System.out.println("before");
            Object invoke = method.invoke(obj, args);
            System.out.println("end");
            return invoke;
        }
    }



}
