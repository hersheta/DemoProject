public class overriding1 {
    public void show(){
        System.out.println("wgydeg");
    }
    void show(int a, int b){
        System.out.println("dsnjdnjs");
    }

    public static void main(String[] args) {
        overriding1 over=new overriding1();
        over.show();
    }
}
