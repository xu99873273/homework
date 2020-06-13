package spoto.day04.q2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入正方形的边长：");
        double a = scan.nextDouble();

        IShape shape = new Square(a);

        double area = shape.area();

        System.out.println("正方形的面积是：" + area);

    }

}
