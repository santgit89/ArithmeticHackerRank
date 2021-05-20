package com.exam.plumbingcompany;

public class PlumberY extends PlumberX{

    public void activity2() {
        System.out.println("Plumber Y Activity 2");
    }

    @Override
    public void plumbpipes(Wrench wrench) {
        System.out.println("PlumbPipes of Plumber Y "+wrench.repairPipes());
    }
}
