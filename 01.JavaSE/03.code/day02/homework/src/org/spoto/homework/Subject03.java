package org.spoto.homework;

import java.util.Scanner;

/**
 * <p>Description : Subject03</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:15
 */
public class Subject03 {

    // 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89	分之间的用B表示，60分以下的用C表示。

    public static void main(String[] args) {

        // 怎么实现用户键盘输入
        System.out.println("请输入成绩：");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 60 && score <= 89) {
//            System.out.println("B");
//        } else if (score < 60) {
//            System.out.println("C");
//        }

        char ch = score >= 90 ? 'A' : (score >= 60 && score <= 89 ? 'B' : 'C');
        System.out.println("学生成绩等级是：" + ch);
    }


}
