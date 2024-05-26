package org.example;

import java.util.Scanner;

public class sumofadigit {
    public static void main(String[] args) {
        {
           int digit;
           int sum=0;
           int num=6786876;
           while(num>0){
               digit=num%10;
               sum=sum+digit;
               num=num/10;

           }
            System.out.println(sum);
        }
    }
}

//print sum here