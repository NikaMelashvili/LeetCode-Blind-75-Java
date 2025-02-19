package com.melashvili.array;

public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int[] answer = productOfArrayExceptSelf(nums);
        for (int j : answer) {
            System.out.println(j);
        }
    }

    public static int[] productOfArrayExceptSelf(int[] nums){
        int N = nums.length;
        int[] l = new int[N];
        int[] r = new int[N];
        int[] a = new int[N];

        l[0] = 1;
        for(int i = 1; i < N; i++){
            l[i] = l[i - 1] * nums[i - 1];
        }

        r[N - 1] = 1;
        for(int i = N - 2; i >= 0; i--){
            r[i] = r[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < N; i++){
            a[i] = l[i] * r[i];
        }
        return a;
    }
}
