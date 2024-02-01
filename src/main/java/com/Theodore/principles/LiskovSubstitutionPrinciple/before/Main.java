package com.Theodore.principles.LiskovSubstitutionPrinciple.before;

/**
 * 里氏代换原则
 * 任何基类可以出现的地方，子类一定可以出现。 通俗理解，子类可以扩展父类的功能，但不能改变父类原有的功能。
 * 换句话说，子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
 * 如果通过重写父类的方法来完成新的功能，这样写起来虽然简单，但是整个继承体系的可复用性会比较差，特别是运用多态比较频繁时程序运行出错的概率会非常大。
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        Square square = new Square();
        square.setLength(10);
        resize(square); // 出现死循环 -> 正方形不是长方形违反里氏代换原则 -> 需要重新定义抽象模型
        printLengthAndWidth(square);
    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 如果宽比长小，进行扩宽
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("rectangle.getLength: " + rectangle.getLength());
        System.out.println("rectangle.getWidth: " + rectangle.getWidth());
    }

}
