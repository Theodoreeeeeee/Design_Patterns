package com.Theodore.principles.DependenceInversionPrinciple.before;

public class Computer {
    private ABCHardDisk abcHardDisk;
    private IntelCpu intelCpu;
    private KingstonMemory kingstonMemory;

    public ABCHardDisk getAbcHardDisk() {
        return abcHardDisk;
    }

    public void setAbcHardDisk(ABCHardDisk abcHardDisk) {
        this.abcHardDisk = abcHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public void run () {
        System.out.println("运行计算机");
        String data = abcHardDisk.get();
        System.out.println("从硬盘获取到的数据是: " + data);
        intelCpu.run();
        kingstonMemory.save();
    }
}
