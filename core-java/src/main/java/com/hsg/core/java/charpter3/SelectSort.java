package com.hsg.core.java.charpter3;

import java.util.Arrays;

/**
 * 选择排序 遍历选出最小的数，记住下标，将该数与数组第一个元素互换 
 * 从剩下的数中变量选出最小的数，记住下标，与数组第二个元素互换
 *  总共需要挑选n-1遍
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] a = { 2, 4, 3, 6, 77, 68, 87, 99, 45, 32, 55, 24 };
        int length = a.length;
        int pos = 0;
        int temp = 0;
        for (int i = 0; i < length - 1; i++) {
            temp = a[i];
            pos = i;
            for(int j=i;j<length;j++){
                if(a[j]<temp){
                    temp = a[j];
                    pos = j;
                }
            }
            if(pos!=i){
                temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
