package com.aryadeep;

public class Comparision {
    public static void main(String[] args) {
        String a =  "Arya";
        String b = "Arya";
        String c = a;
        System.out.println(c == a);  // prints true

        // ==
//        System.out.println(a == b);   //prints true

        String name1 = new String("Arya");
        String name2 = new String("Arya");
//        System.out.println(name1 == name2);    // prints false         == is comparator

        System.out.println(name1.equals(name2)); // prints true          .equals is method     //it cares only value
        System.out.println(name1.charAt(0));
    }
}
