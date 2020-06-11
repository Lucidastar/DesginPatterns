package com.lucidastar.proxy.statics;

/**
 * 巫师塔
 */
public interface WizardTower {
    //巫师塔进入巫师
    void enter(Wizard wizard);

    void showName(String name);
    //结果
    String result();
}
