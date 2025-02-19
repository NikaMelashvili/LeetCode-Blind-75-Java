package com.melashvili.array;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

    public static void main( String[] args )
    {
        int[] first = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int[] second = {1};

        int[] third = {5, 4, -1, 7, 8};

        List<int[]> list = new ArrayList<>();

        list.add(first);
        list.add(second);
        list.add(third);
        for (int i = 0; i < 3; i++){
            int answer = maxSubArray(list.get(i));
            System.out.println(answer);
        }
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
