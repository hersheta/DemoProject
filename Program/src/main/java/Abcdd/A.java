package Abcdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class A {
   int num = 34365;
   int rev = 0;
   {
      rev = rev * 10 + num % 10;
      num = num / 10;


      System.out.println(rev);
   }
}