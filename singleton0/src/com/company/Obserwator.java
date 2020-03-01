package com.company;

public class Obserwator implements ObserwatorI{
    @Override
    public void update() {
        System.out.println("Update obserwator");
    }
}
