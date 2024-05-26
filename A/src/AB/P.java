package AB;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class  P {
    static int x = 23;

    static void run() {
        System.out.println("static method");
    }

    static {
        System.out.println("multiple static block");
    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(P.x);
        P.run();
    }
}