package spoto.day04.q1;

/**
 * 编写一个抽象类Shape，声明计算图形面积的抽象方法。
 * 再分别定义Shape的子类Circle（圆）和Rectangle（矩形）， 长*宽  pi*r*r
 * 在两个子类中按照不同图形的面积计算公式，
 * 实现Shape类中计算面积的方法
 *
 * @author Administrator
 */
public abstract class Shape {

    /**
     * 计算面积
     *
     * @param param1 圆：pi  矩形：长
     * @param param2 圆：r  矩形：宽
     */
    public abstract void calcArea(double param1, int param2);

}
