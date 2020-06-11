package com.lucidastar.proxy.statics;

/**
 * 象牙塔
 */
public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.toString()+"  enter wizard");
    }
    @Override
    public void showName(String name) {
    }
    @Override
    public String result() {
        return null;
    }
}
