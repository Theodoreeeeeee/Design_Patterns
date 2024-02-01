package com.Theodore.principles.DependenceInversionPrinciple.before;

/**
 * 高层模块不应该依赖低层模块，二者都应该依赖其抽象。抽象不应该依赖细节，细节应该依赖抽象
 * 简单地说就是要求对抽象进行编程，不要对实现进行编程，这样就降低了客户与实现模块间的耦合。
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        ABCHardDisk abcHardDisk = new ABCHardDisk();
        IntelCpu intelCpu = new IntelCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();
        computer.setAbcHardDisk(abcHardDisk);
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.run();
    }
}
