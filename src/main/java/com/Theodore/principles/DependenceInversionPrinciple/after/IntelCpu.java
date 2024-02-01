package com.Theodore.principles.DependenceInversionPrinciple.after;

public class IntelCpu implements Cpu{
    public void run() {
        System.out.println("Intel处理器running...");
    }
}
