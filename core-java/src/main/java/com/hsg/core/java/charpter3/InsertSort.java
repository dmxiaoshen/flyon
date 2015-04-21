package com.hsg.core.java.charpter3;

import java.util.Arrays;

/**
 * 插入排序 
 * 假定第一个元素是已经排好序的，取出一个待排序元素，依次与已排序数组的元素比较，直到找到小于或等于该待排序元素的位置，插入其中
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] a = { 5, 3, 7, 56, 45, 77, 89, 87, 65, 3, 6, 1, 14, 58, 99, 21 };
        int length = a.length;
        int choose = 0;
        int pos = 0;

        for (int i = 1; i < length; i++) {
            choose = a[i];
            pos = i;

            for (int j = i - 1; j >= 0; j--) {
                if(a[j]>choose){
                    a[j+1] = a[j];
                    pos = j;
                }else{
                    break;
                }
            }
            if(pos!=i){
                a[pos] = choose;
            }
        }
        
        System.out.println(Arrays.toString(a));
    }
}
