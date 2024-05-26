package AB;

import java.util.HashMap;

public class Countingg {
    public static void countoccurance(String s){
        HashMap<Character,Integer>hm=new HashMap<Character, Integer>();
        char str[]=s.toCharArray();

        for(char c:str)
        if(hm.containsKey(c)){
            hm.put(c,hm.get(c)+1);//if char c is present in hashmap increase it's count by 1

        }
        else {
            hm.put(c,1);//if not present update the actual value
           // it occured only 1 time so write (c,1)
        }
        System.out.println(s+hm);
    }

    public static void main(String[] args) {
        countoccurance("harshita");

    }

}
