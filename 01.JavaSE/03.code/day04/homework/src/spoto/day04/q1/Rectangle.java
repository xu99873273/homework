package spoto.day04.q1;

/**
 * 矩形
 *
 * @author Administrator
 */
public class Rectangle extends Shape {

    @Override
    public void calcArea(double param1, int param2) {

        double area = param1 * param2;//类型自动转换，从小到大

        System.out.println("矩形的面积是：" + area);
    }

}
