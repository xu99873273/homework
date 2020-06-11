package spoto.day04.q1;

public class Test {

    public static void main(String[] args) {

        Shape shape = new Circle();
        shape.calcArea(3.14, 10);

        shape = new Rectangle();
        shape.calcArea(5, 2);

        Circle circle = new Circle();
        circle.calcArea(100, 200);

        //上转型对象和子类对象的区别
        //1、最终调用的，都是子类对象的方法
        //2、上转型不同的是：上转型对先判断父类有没有这个方法

    }

}
