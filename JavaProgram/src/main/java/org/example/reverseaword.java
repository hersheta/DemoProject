package org.example;

public class reverseaword {
    public static void main(String[] args) {
        String s[] = "I am me".split(" ");
        String rev = " ";
        for (int i = s.length - 1; i >= 0; i--) {
            rev = rev + s[i] + " ";
            System.out.println(rev.substring(0, rev.length() - 1));
        }

    }
}