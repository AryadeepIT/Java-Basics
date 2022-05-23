package com.aryadeep;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');   // 195
        System.out.println("a" + "b");    //ab
        System.out.println('a' + 3);      // 100
        System.out.println((char)('a' + 3));      // d

        System.out.println("a" + 1);     //a1
        // this is same as after a few steps : "a" + "1"
        // integer will be converted to Integer that will call toString()
        System.out.println("Arya" + new ArrayList<>());    //Arya[]
        System.out.println("Arya" + new Integer(56));  // Arya56
        System.out.println(new Integer(56) + "" + new ArrayList<>());  //56[]

    }
}
