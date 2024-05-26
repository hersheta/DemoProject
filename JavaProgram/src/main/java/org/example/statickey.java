package org.example;

public class statickey {
    static{
        System.out.println("static bloxk");
    }
    static{
        System.out.println("static block2");
    }

    public void show(){
        System.out.println("dhjdfjhf");
    }


    public static void main(String[] args) {
        System.out.println("main");
        statickey s=new statickey();
        s.show();

    }

    }
//no object creation needed for static block
//always executed
//as many as you want
//printing priority goes to static block