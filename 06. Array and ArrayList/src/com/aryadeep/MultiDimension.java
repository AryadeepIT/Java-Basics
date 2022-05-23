package com.aryadeep;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        // first[] is for rows , second [] is for columns
//        int[][] arr = new int[3][]; // declaring rows are mandatory, columns are not mandatory

//        int[][] arr = {
//                {1, 2, 3},   //0th index
//                {4, 5},  //1st index  -> arr[1][1] = {5}
//                {6, 7, 8, 9}  //2nd index -> arr[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // no of rows

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//
//        }

        // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }


        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));

        }
    }
}




