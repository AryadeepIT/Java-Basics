package com.aryadeep;

public class Reverse {
    public static void main(String[] args) {
        int num = 232435;
        int ans = 0;
        while (num > 0){
            int rem = num % 10;
            num /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
