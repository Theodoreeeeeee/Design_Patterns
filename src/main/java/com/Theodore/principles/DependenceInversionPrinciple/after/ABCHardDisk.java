package com.Theodore.principles.DependenceInversionPrinciple.after;

public class ABCHardDisk implements HardDisk{

    @Override
    public void save(String data) {
        System.out.println("使用ABC硬盘存储数据: " + data);
    }

    @Override
    public String get() {
        System.out.println("使用ABC硬盘获取数据");
        return "data!";
    }
}
