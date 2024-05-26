package program;

public interface family {
    int size = 5;

    void work();

    static void eat() {
        System.out.println("with spoon");

    }
    interface Member{
        int salary_count=5;
        void meet();
    }
    abstract class Home{
        int home_count=23;
        abstract void functio();
    }
    static void laugh(){
        System.out.println("hahaha");
    }

    class  Mother extends Home implements family,Member{
        public void work () {
            System.out.println("as a teacher");
        }
        public void meet(){
            System.out.println("hug");
        }
        public void functio(){
            System.out.println("tik tik");
        }
    }
        public static void main(String args[]){
           Mother m=new Mother();
            System.out.println(m.size);
          m.work();
          family.eat();
          m.meet();
          m.functio();


        }



}
//interface variable are final so cannot be modified by sub class
//interface methods are abstract , static and default
//if method is abstract body should be given by sub  class
//A class can implement more than 1 interface
//a clas can imolement more than 1 interfce and can extend 1 class
// if a class co ntains abstract method it is an abstract class
//anstaarct class can have abstract as well as non abstract methiod
// no reestriction on variable
//if we make abstarct method private it won't be accessible to child class
//abstract class inside interface can't be public can be bastract , static , default
