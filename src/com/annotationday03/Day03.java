package com.annotationday03;

import java.util.HashMap;
import java.util.Map;

public class Day03 {

    /**
     * 多数元素求解,返回出现次数最多的数字
     *
     * hashmap方式求解
     */
    public Map<Integer,Integer> element(int []nums){
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer num :
                nums) {
            if (map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }
        return map;
    }
    public int majorityElement(int []nums){
        Map<Integer, Integer> element = element(nums);
        Map.Entry<Integer,Integer> map=null;
        for (Map.Entry<Integer,Integer> entry :
                element.entrySet()) {
            //如果发现比map还要大的数字，就将对象替换，从而获取出现次数最多的数字
            if (map==null|| (entry.getValue() > map.getValue())){
                map=entry;
            }
        }
        return map.getKey();
    }
    //颠倒二进制位
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
    //编写一个函数，输入是一个无符号整数（以二进制串的形式），
    // 返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }



    public boolean isPowerOfTwo2(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }

    //计算不同工资状态下，公积金的大于比例
    public void setAmount(){
        int fisrt=720;
        int second=960;
        int temp=12000;
        int sum=7000;
        int count=0;
        for (int i = 1; i < 12; i++) {
            temp+=fisrt*2;
            sum+=second*2;
            if (sum>temp){
                System.out.println(i+"  "+sum+"  "+temp);
            }
            count++;
        }
        System.out.println(fisrt*2*12+"  "+second*2*12);
    }

    public static void main(String[] args) {
        Day03 day03=new Day03();
//        System.out.println(day03.isPowerOfTwo2(1));
        day03.setAmount();

    }


}
