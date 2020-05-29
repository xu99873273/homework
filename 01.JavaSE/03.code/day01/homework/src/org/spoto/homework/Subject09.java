package org.spoto.homework;

/**
 * <p>Description : Subject09</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:24
 */
public class Subject09 {

    /**
     * 9、定义一个int型的一维数组，包含10个元素，
     * 分别赋一些随机整数，
     * 然后求出所有元素的最大值，最小值，平均值，和值，并输出来
     */

    public static void main(String[] args) {

        //1、定义数组
        int[] arr = new int[10];

        //2、数组随机赋值
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);//随机数
            System.out.println(arr[i]);
        }

        //3、求和
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += arr[i];
        }

        //4、平均值
        double avg = total / 10;

        //5、最大值和最小值
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {//最大
                max = arr[i];
            }
            if (min > arr[i]) {//最小
                min = arr[i];
            }
        }

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("平均值：" + avg);
        System.out.println("和值：" + total);
    }

}
