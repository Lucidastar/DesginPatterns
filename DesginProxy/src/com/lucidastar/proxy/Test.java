package com.lucidastar.proxy;

import com.lucidastar.proxy.statics.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println("代理模式");
        IvoryTower ivoryTower = new IvoryTower();
        OtherTower otherTower = new OtherTower();
        WizardTower wizardTower = new IvoryTowerProxy(otherTower);
//        wizardTower.enter(new Wizard("red wizard"));
//        wizardTower.enter(new Wizard("black wizard"));
//        wizardTower.enter(new Wizard("green wizard"));
//        wizardTower.enter(new Wizard("pink wizard"));
//        testDynamic();
        test();
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

    public static void test(){
        String data = "233";
        String result = "";
        if (data.contains(".")){
            BigDecimal   bd   =   new BigDecimal(data);
            bd   =   bd.setScale(2,BigDecimal.ROUND_DOWN);

//            System.out.println(bd.toString());
        }else {
            result = new StringBuilder(data).append(".00").toString();
        }

//        System.out.println(result);

        String test = "http://weixin.qiuyouzone.com/WXGZPT/html/gyy_h5/player_rank/rank_index.html?area=上海市&city=北京市&ballType=1&filt=2";
        if (test.contains("?")){
            int length = test.length();
            String substring = test.substring(test.lastIndexOf("?"), length);
            String[] split = test.split("\\?");
            System.out.println(split[0]);
            System.out.println(split[1]);
            System.out.println(substring);
        }
    }


}
