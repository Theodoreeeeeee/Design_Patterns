package com.Theodore.principles.InterfaceSegregationPrinciple.before;

/**
 * 客户端不应该被迫依赖于它不使用的方法，一个类对另一个类的依赖应该建立在最小的接口上
 */
public class Main {
    public static void main(String[] args) {
        TheodoreDoor theodoreDoor = new TheodoreDoor();
        theodoreDoor.antiTheft();
        theodoreDoor.fireProof();
        theodoreDoor.waterProof();
    }
}
