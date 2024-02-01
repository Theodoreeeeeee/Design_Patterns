package com.Theodore.principles.DependenceInversionPrinciple.after;

public interface HardDisk {

    // 存储数据
    void save(String data);
    String get();
}
