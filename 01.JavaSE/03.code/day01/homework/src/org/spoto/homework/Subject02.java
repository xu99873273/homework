package org.spoto.homework;

/**
 * <p>Description : Subject2</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:14
 */
public class Subject02 {

    // 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方

    public static void main(String[] args) {
        // num1：百位 num2:十位 num3：个位
        int num1, num2, num3;
        // 三位数的立方和
        int sum;
        // 三位数
        for (int i = 100; i <= 999; i++) {
            // 求百位
            num1 = i / 100;
            // 求十位
            num2 = i % 100 / 10;
            // 求个位
            num3 = i % 10;
            // 计算立方和
            sum = num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3;
            // 判断是否相等
            if (i == sum) {
                System.out.println("水仙花数：" + i);
            }
        }
    }

}
