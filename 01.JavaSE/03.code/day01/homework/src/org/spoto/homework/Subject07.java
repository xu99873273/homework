package org.spoto.homework;

import java.util.Scanner;

/**
 * <p>Description : Subject07</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:23
 */
public class Subject07 {

    // 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母

    public static void main(String[] args) {

        Subject07 sj = new Subject07();

        System.out.println("请输入星期几的首字母：");
        char ch = sj.getChar();
        switch (ch) {
            case 'M':
                System.out.println("Monday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'T': {
                System.out.println("请输入星期几的第二个字母：");
                char ch2 = sj.getChar();
                if (ch2 == 'U') {
                    System.out.println("Tuesday");
                } else if (ch2 == 'H') {
                    System.out.println("Thursday");
                } else {
                    System.out.println("输入错误");
                }
            }
            ;
            break;
            case 'S': {
                System.out.println("请输入星期几的第二个字母：");
                char ch2 = sj.getChar();
                if (ch2 == 'U') {
                    System.out.println("Sunday");
                } else if (ch2 == 'A') {
                    System.out.println("Saturday");
                } else {
                    System.out.println("输入错误");
                }
            }
            ;
            break;
            default:
                System.out.println("首字母输入错误");
        }
    }

    public char getChar() {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = str.charAt(0);
        if (ch < 'A' || ch > 'Z') {
            System.out.println("输入字母错误");
            ch = getChar();
        }
        return ch;
    }

}
