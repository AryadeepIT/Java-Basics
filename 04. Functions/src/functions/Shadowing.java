package functions;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);  //90
        int x; // (initializing)
//        System.out.println(x);  // scope is begin when value is initialized.
        x= 40; // (Declaring) --- the class variable at line 4 is shadowed by this
        System.out.println(x); //40
        fun();
        
    }
    static void fun(){
        System.out.println(x);
    }
}
