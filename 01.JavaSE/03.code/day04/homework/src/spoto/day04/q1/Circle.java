package spoto.day04.q1;

/**
 * 圆
 *
 * @author Administrator
 */
public class Circle extends Shape {

    //super关键字作用：在子类中调用父类

    @Override
    public void calcArea(double param1, int param2) {
        double area = param1 * param2 * param2;
        System.out.println("圆的面积是：" + area);
    }

}
