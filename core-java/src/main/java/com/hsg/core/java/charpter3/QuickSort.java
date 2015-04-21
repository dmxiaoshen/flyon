package com.hsg.core.java.charpter3;

import java.util.Arrays;

/**
 * 快速排序
 *  找一个数作为基准，把大于该数的值放右边，小于该数的值放左边， 
 *  递归调用，对右边的数组做同样处理，左边的也是。 
 *  分治思想
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] a = { 2, 56, 43, 57, 87, 32, 14, 34, 52, 33, 27, 89, 99, 74 ,77 };
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left >= right)
            return;

        int low = left;
        int high = right;
        //int tempx = a[low];
       // a[low]= a[(low+high)/2];
        //a[(low+high)/2] = tempx;
        //int base = a[low];
        int base = a[left];
        //System.out.println("base = "+base);
        boolean flag = false;
        while (low < high) {
            if (flag) {
                if (a[low] > base) {
                    int temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;
                    flag = false;
                    high--;
                } else {
                    low++;
                }
               
            } else {
                if (a[high] < base) {
                    int temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;
                    flag = true;
                    low++;
                } else {
                    high--;
                }
               
            }
        }

        //System.out.println("low = "+low);
        quickSort(a, left, low - 1);
        quickSort(a, low + 1, right);
    }

    public static void quickSort1( int intarrary[],int left,int right) {
        System.out.println("1====");

        int low = left, high = right;

        if(low < high) {

            int key = intarrary[low];

            int temp = 0, p = 0;

            while(low < high) {

                if(p == 0) {

                    if(intarrary[high] < key) {

                        temp = intarrary[low];

                        intarrary[low] = intarrary[high];

                        intarrary[high] = temp;

                        p = (p + 1) % 2;

                    } else{

                        high--;

                    }

                }

                if(p == 1) {

                    if(intarrary[low] > key) {

                        temp = intarrary[low];

                        intarrary[low] = intarrary[high];

                        intarrary[high] = temp;

                        p = (p + 1) % 2;

                    }else{

                        low++;

                    }

                }

            }

            // System.out.print("*"+low+high);

            quickSort1(intarrary, left, low - 1);

            quickSort1(intarrary, low + 1, right);

        }else{
            return;
        }

    }

}
