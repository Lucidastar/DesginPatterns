package com.lucidastar.proxy.statics;

public class OtherTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.toString()+"enter wizard");
    }

    @Override
    public void showName(String name) {

    }

    @Override
    public String result() {
        return null;
    }
}
