package com.melashvili.array;

public class ProductSubArray {

    public static void main( String[] args )
    {
        int[] arr = new int[] {3, -4, 4};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        int maxProd = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            maxProd = Math.max(maxProd, prefix);
            maxProd = Math.max(maxProd, suffix);
        }

        return maxProd;
    }

}
