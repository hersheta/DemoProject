package org.example;

public class dotdouble {
    public static void main(String[] args) {
        String s="Ram";
        String s1="Ram";
        String s3=new String("Ram");
        String s4=new String("sHYAM");
        String s5="sUMEE";

        System.out.println(s==s1);//true
        System.out.println(s==s3);//false
        System.out.println(s=s4);//false
        System.out.println(s==s5);//false
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s3));//true
        System.out.println(s.equals(s5));//false

    }
}
