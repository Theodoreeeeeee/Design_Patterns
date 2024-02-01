package com.Theodore.principles.DependenceInversionPrinciple.before;

public class ABCHardDisk {

    public void save(String data) {
        System.out.println("使用ABC硬盘存储数据: " + data);
    }

    public String get() {
        System.out.println("使用ABC硬盘获取数据");
        return "data!";
    }
}
