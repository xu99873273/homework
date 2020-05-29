package org.spoto.homework;

import java.util.Scanner;

/**
 * <p>Description : Subject04</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:16
 */
public class Subject04 {

    // 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scan.nextLine();// 从键盘输入

        // abc123 456！
        int letter = 0;// 统计字母
        int digital = 0;// 统计数字
        int space = 0;// 统计空格
        int other = 0;// 统计其它

        char[] chs = str.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
            // 统计数量
            if (chs[i] >= '0' && chs[i] <= '9') {
                digital = digital + 1;
            } else if (chs[i] >= 'a' && chs[i] <= 'z' || chs[i] >= 'A' && chs[i] <= 'Z') {
                letter++;
            } else if (chs[i] == ' ') {
                space++;
            } else {
                other++;
            }

        }

        System.out.println("数字个数: " + digital);
        System.out.println("英文字母个数: " + letter);
        System.out.println("空格个数: " + space);
        System.out.println("其他字符个数:" + other);
    }

}
