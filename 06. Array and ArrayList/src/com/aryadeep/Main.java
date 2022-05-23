package com.aryadeep;

public class Main {
    public static void main(String[] args) {
        // Q :-  Store a roll number
        int a = 19;

        // Q :- Store a person's name
        String name = "Arya";

        // Q :- Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 63;
        int rno3 = 83;

        // syntax
        // datatype [] variable_name = new datatype[size];

        // store 5 roll numbers:
        int[] rollnos = new int[5];
        //or directly
        int[] rollnos2 = {23, 12, 45, 32, 15};

        int[] ros; //declaration of array . ros is getting defined in the stack.
        ros = new int[5]; // actually here object is being created in the memory. (heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);

//        for ( String element : arr){
//            System.out.println(element);
//        }

        String str = null;
        // None in python



    }
}
