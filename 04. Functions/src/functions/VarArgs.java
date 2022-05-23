package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6);
//        multiple(2,3, "Arya", "Rohan");
        demo(2,3,4);
        demo("Arya", "Rohit");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }


    static void multiple(int a, int b, String ...v){ //variable arguments always comes at end

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
