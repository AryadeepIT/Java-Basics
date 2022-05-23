package com.aryadeep;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int a = 1;
//        for (int rows = 0; rows < 3; rows++) {
//            for (int cols = 0; cols < 2; cols++) {
//                System.out.println(cols + ".Hello");
//            }
//        }

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 4; col++) {
                arr[row][col]=in.nextInt();
            }
            System.out.println(Arrays.toString(arr[row]));

        }

    }
}
