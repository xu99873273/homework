package spoto.day03;

/**
 * <p>Description : Circle</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-6-11 11:22
 */
public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 计处圆面积
     *
     * @return
     */
    public double findArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

}
