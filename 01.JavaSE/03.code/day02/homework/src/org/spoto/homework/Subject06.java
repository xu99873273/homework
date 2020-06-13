package org.spoto.homework;

import java.util.Scanner;

/**
 * <p>Description : Subject06</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:23
 */
public class Subject06 {

    // 输入某年某月某日，判断这一天是这一年的第几天

    public static void main(String[] args) {
        int year, month, day;
        int total = 0;
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner s = new Scanner(System.in);

        System.out.println("请输入年：");
        year = s.nextInt();
        System.out.println("请输入月：");
        month = s.nextInt();
        System.out.println("请输入日");
        day = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {// 闰年
            array[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            total += array[i];
        }

        total += day;

        System.out.println("这一天是这一年的第几天：" + total);

    }

}
