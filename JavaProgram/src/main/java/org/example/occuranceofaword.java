package org.example;

import java.util.HashMap;

public class occuranceofaword {
    public static void getcharcount(String s1) {
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        char str[]=s1.toCharArray();
        for(char c : str)
            if(hm.containsKey(c)) {
                hm.put(c,hm.get(c)+1);
            }

            else {
                hm.put(c, 1);
            }

        System.out.println(s1 + " : " + hm);

    }

    public static void main(String args[]) {
        getcharcount("Harshita");
    }
}
//getputcontainskey
//if(hm.containskey(c)
//for(data type new var name: variable name existing)
//get put contains key
//hm.put(hm.get(c)+1);
//hm.put(c,1);

