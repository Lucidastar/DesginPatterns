package com.lucidastar.proxy.statics;

public class IvoryTowerProxy implements WizardTower {
    private int numWizards;
    private static final int NUM_WIZARDS_ALLOWED = 3;
    private final WizardTower tower;

    public IvoryTowerProxy(WizardTower tower) {
        this.tower = tower;
    }

    @Override
    public void enter(Wizard wizard) {
        long startTime = System.currentTimeMillis();
        if (numWizards < NUM_WIZARDS_ALLOWED) {
            tower.enter(wizard);
            numWizards++;
        } else {
           System.out.println(wizard.toString()+" is not allowed to enter!");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time = "+(endTime - startTime));
    }

    @Override
    public void showName(String name) {

    }

    @Override
    public String result() {
        return null;
    }
}
