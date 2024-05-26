package AB;

import org.w3c.dom.ls.LSOutput;

public interface Animal {
    int count = 2;

    abstract void fly();

    static void run() {
        System.out.println("fSTTT");
    }
}
abstract class C{
    void sleep(){
        System.out.println("skdnkdh");
    }
    abstract void woo();

}
class Lion extends C implements Animal{
    public void fly(){
    System.out.println("fhfh");

}
public void woo(){
    System.out.println("djfjf");
}
void run(){
    System.out.println("nksfnfksnfsk");
}

    public static void main(String[] args) {
        Lion l=new Lion();
        l.fly();
        l.run();
        l.woo();
        System.out.println(l.count);
    }

    }
