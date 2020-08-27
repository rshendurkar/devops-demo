public class B extends A {

    public static void abc(){
        System.out.println("This is child class");
    }

    public static void main(String args[]){

        A a=new B();
        a.abc();
    }
}
