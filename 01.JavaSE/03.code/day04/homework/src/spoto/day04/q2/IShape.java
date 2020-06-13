package spoto.day04.q2;

/**
 * 二、创建一个接口IShape，
 * 1、接口中有一个求取面积的抽象方法“public double area()”。
 * 2、定义一个正方形类Square，该类实现了IShape接口。
 * Square类中有一个属性a表示正方形的边长，
 * 在构造方法中初始化该边长。
 * 3、定义一个主类，在主类中，创建Square类的实例对象，求该正方形对象的面积
 *
 * @author Administrator
 */
public interface IShape {
    /**
     * 求取面积
     *
     * @return 面积
     */
    double area();

}
