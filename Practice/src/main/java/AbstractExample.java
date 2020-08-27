public  abstract class AbstractExample implements InterfaceExample{

    AbstractExample(){
        System.out.println("You are in abstract class constructor");
    }

    public void xyz(){
        System.out.println("This is abstract class and printing variable value  ");
    }

    public void pqr(){
        System.out.println("Implemented all method");
    }

    public static void mmm(){
        System.out.println("Implemented all method");
    }


public static void main(String args[]){
    mmm();
}
}
