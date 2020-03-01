package com.company.observer;

public class Observer implements ObserverI {
    @Override
    public void update() {
        System.out.println("Update obserwator");
    }
}
