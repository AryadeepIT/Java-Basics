package com.aryadeep;

public class ques5_pattern {
    public static void main(String[] args) {
        pattern5(4);

    }


    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            // for every row, run the col
            int totalcolsinrow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();

        }
    }
}

