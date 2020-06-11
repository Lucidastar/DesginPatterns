package com.lucidastar.proxy.statics;

/**
 * 巫师
 */
public class Wizard {
    //巫师名字
    private String name;
    public Wizard(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
