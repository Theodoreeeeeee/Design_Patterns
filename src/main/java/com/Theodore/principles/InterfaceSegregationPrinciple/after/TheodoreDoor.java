package com.Theodore.principles.InterfaceSegregationPrinciple.after;

public class TheodoreDoor implements AntiTheft, FireProof, WaterProof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
