package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.Map;

public class ITER {
    public static void main(String[] args) {
        HashMap<String,String>hm=new HashMap<String,String>();
        hm.put("hatshita","srivastava");
        hm.put("djdjn","dshjf");
        for(Map.Entry<String,String>entry:hm.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
