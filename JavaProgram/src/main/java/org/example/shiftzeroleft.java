package org.example;

import java.util.Arrays;

public class shiftzeroleft {
    public static int[] getzero(int a[]) {
        if (a.length == 1)
            return a;

        int count = 0;
        int newarr[]=new int[a.length];
        for (int num : a)
            if (num == 0) {
                newarr[count] = num;
                count++;
            }
        for (int num : a)
            if (num != 0) {
                newarr[count] = num;
                count++;
            }

        return newarr;
    }



    public static void main(String[] args) {
        int i[]={1,34,6,0,5,0,0,0,2,0};
        System.out.println(Arrays.toString(getzero(i)));
    }

            }
