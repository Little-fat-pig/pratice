package com.annotation.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day01 {
    /**
     * 1720. 解码异或后的数组
     *
     * 异或运算具有如下性质：
     *
     * 异或运算满足交换律和结合律；
     *
     * 任意整数和自身做异或运算的结果都等于 00，即 x \oplus x = 0x⊕x=0；
     *
     * 任意整数和 00 做异或运算的结果都等于其自身，即 x \oplus 0 = 0 \oplus x = xx⊕0=0⊕x=x。
     */

    public static void main(String[] args) {
        int[] a = {6,2,7,3};
        int[] b = new int[a.length + 1];
        b[0]=4;
        for (int i = 1; i < b.length; i++) {
            b[i]=b[i-1]^a[i-1];


        }
        System.out.println(Arrays.toString(b));


        int [] c={2,7,2,3,6,4};
        int target=9;
        for (int i = 0; i < c.length-1; i++) {

            if (target==c[i]+c[i+1]){
                System.out.println(i+"  "+(i+1));
                return;
            }
        }



    }


}
