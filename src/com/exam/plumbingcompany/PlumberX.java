package com.exam.plumbingcompany;

public class PlumberX implements PlumbingActivities {


    @Override
    public void activity1() {
        System.out.println("Plumber x actvity 1");
    }

    @Override
    public void plumbpipes(Wrench wrench) {
        System.out.println("PlumbPipes in Plumber X");
    }
}
