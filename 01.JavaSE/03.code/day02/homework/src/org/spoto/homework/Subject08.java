package org.spoto.homework;

/**
 * <p>Description : Subject08</p>
 * <p>DevelopTools : Idea_2020.01</p>
 * <p>DevelopSystem : Windows10</p>
 * <p>Company : org.xujun</p>
 *
 * @author : XuJun
 * @version : 1.0.0
 * @date : 2020-5-29 10:23
 */
public class Subject08 {

    // 定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出

    public static void main(String args[]) {
        int aar[] = {1, 3, 10, 4, 5, 7, 3, 9};
        if (aar.length > 0) {
            int aar_Max = aar[0];
            int aar_index = 0;
            for (int i = 0; i < aar.length; i++) {
                if (aar[i] > aar_Max) {
                    aar_Max = aar[i];
                    aar_index = i;
                }
            }
            System.out.println("数组中最大数是：" + aar_Max + "  下标索引是： " + aar_index);
        }
    }

}
