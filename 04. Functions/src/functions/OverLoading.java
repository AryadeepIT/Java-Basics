// when two or more functions have the same name
// but different arguments is called Function Overloading.
//it decides at compiling time.

package functions;

public class OverLoading {
    public static void main(String[] args) {
//        fun(67); // this will call int function
//        fun("Aryadeep"); // this will call String function
        int ans = sum(3,4,5);
        System.out.println(ans);

    }



    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }


    static void fun(int a){
        System.out.println("First");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second");
        System.out.println(name);

    }


}
