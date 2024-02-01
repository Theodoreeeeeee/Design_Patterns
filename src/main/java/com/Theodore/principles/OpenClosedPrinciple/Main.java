package com.Theodore.principles.OpenClosedPrinciple;

/**
 * 开闭原则
 * 对扩展开放，对修改关闭，需要使用接口和抽象类，当软件需要发生变化时，只需要根据需求重新派生一个实现类来扩展
 */
public class Main {
    public static void main(String[] args) {
        // 创建输入法，换肤功能
        SouGouInput souGouInput = new SouGouInput();

        DefaultSkin defaultSkin = new DefaultSkin();
        souGouInput.setSkin(defaultSkin);
        souGouInput.display();

        TheodoreSkin theodoreSkin = new TheodoreSkin();
        souGouInput.setSkin(theodoreSkin);
        souGouInput.display();
    }
}
