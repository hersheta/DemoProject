package org.example;

public class swap2withoutthird {
    public static void main(String[] args) {
        int x = 12;
        int y = 87;
        System.out.println("before swap:" + x + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("after swapping:" + x + y);
    }
}
