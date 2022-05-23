package com.aryadeep;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPAlindrome(str));

    }
    static  boolean isPAlindrome(String str){
        if (str == null || str.length() == 0 ){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(end != start){
                return false;
            }


            
        }
        return true;
    }

}
