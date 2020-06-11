package spoto.day04.q2;

/**
 * 正方形
 *
 * @author Administrator
 */
public class Square implements IShape {

    private double a;//边长

    public Square() {

    }

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }


}
