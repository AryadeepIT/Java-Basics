package com.aryadeep;

public class OrderAgnosticBS {
    public static void main(String[] args){
//        int[] arr = {-7, -5, -3, -1, 0, 2, 4, 6, 7, 9, 12};
        int[] arr = {99, 88, 77, 45, 30, 12, 5, 0, -8, -15, -98};
        int target = -15;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);


    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc;
        isAsc = arr[start] < arr[end];
        while (start <= end){
            // find the middle element
//            int mid = (start + end) / 2;  // might be possible that (start + end ) exceeds the range of integer in java
            int mid = start + (end - start) / 2;

            if (arr[mid] ==  target ){
                return mid;
            }
            if (isAsc){
                if ( target < arr[mid]){
                    end = mid - 1;
                } else if ( target > arr[mid]){
                    start = mid + 1;
                }else{
                    // ans found
                    return mid;
                }
            } else {
                if ( target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }



        }
        return  -1;
    }
}
