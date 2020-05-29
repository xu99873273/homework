package org.spoto.homework;

import java.util.Scanner;

/**
 * <p>Description : Subject10</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:24
 */
public class Subject10 {

    public static void main(String[] args) {
        // 输出9*9口诀表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

//		1*1=1
//		1*2=2 2*2=4
// 		1*3=3 2*3=6 3*3=9

}
