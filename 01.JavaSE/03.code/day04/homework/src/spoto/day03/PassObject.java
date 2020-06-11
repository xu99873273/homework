package spoto.day03;

/**
 * <p>Description : PassObject</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-6-11 11:23
 */
public class PassObject {

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\t\tArea");
        // 循环
        for (int i = 1; i <= time; i++) {
            c.setRadius(i);
            double area = c.findArea();
            System.out.println((double) i + "\t\t\t" + area);
        }
    }

}
