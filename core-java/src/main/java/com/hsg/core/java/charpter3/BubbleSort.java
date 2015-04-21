package com.hsg.core.java.charpter3;

import java.util.Arrays;

/**
 * 冒泡排序
 * 每一个数都跟它相邻的后一个的数比较，如果前者大于后者，则两数互换位置
 * 一轮比较下来，最大的数被放到了最后
 * 总共需要n-1轮比较
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = { 3, 6, 4, 9, 32, 54, 12, 31, 56, 76, 64, 9 };
        int length = a.length;
        for (int j = 1; j < length; j++) {

            for (int i = 0; i < length - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
