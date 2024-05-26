package Practice;

import java.util.Arrays;

public class A {

        public static int[] getzeroatleft(int []a) {
            if(a.length==1)
                return a;

            int count=0;
            int newarr[]=new int[a.length];

            for(int num:a)
                if(num==0) {
                    newarr[count]=num;

                    count++;
                }

            for(int num:a)
                if(num!=0) {
                    newarr[count]=num;
                    count++;
                }




            return newarr;

        }

        public static void main(String args[]){
            int i[]= {1,2,1,0,1,0,1,1,0};
            {
                System.out.println(Arrays.toString(getzeroatleft(i)));


            }

        }
    }