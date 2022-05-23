package com.aryadeep;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 25;
        arr[3] = 46;
        arr[4] = 90;
        // [23, 45, 25, 46, 90]
        System.out.println(arr[4]);


        // input using for loops
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));

//        for (int j : arr) {
//            System.out.print(j + " ");
//        }

//        for( int num  : arr){ //for every element in array, print the element
//            System.out.print(num + " "); // here num represents the element of the array
//        }

//        System.out.println(arr[5]); // index out of bound error


        // array of objects
        String[] str = new String[4];
        for( int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Arya";
        System.out.println(Arrays.toString(str));

    }
}
