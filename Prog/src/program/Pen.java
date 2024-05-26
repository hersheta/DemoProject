package program;

public interface Pen {
int size=10;
void write();
static void read(){
    System.out.println("hffh");
}
class Reynold implements Pen{
  //  Pen.write();
    public void write(){
        System.out.println("dhfhf");
    }
    void run(){
        System.out.println("hg");

    }
    public static void main(String args[]){
        Reynold r=new Reynold();

    }
}
}