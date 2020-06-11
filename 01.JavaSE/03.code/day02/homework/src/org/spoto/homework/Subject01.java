package org.spoto.homework;

/**
 * <p>Title : Subject1</p>
 * <p>Description : Subject1</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 9:56
 */
public class Subject01 {

    // 判断101-200之间有多少个素数，并输出所有素数

    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 101; i <= 200; i++) {
            for (int j = 2; j <= i - 1; j++) {
                // 只要有一个能被整除，就不是素数
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(i + "\t");
            }
            // 标志复位，以便下一个数字判断
            flag = true;
        }
    }

}
