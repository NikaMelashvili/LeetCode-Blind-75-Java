package com.melashvili.array;

public class TwoSum {

    static int[] nums = {3, 7, 4, 10};

    static int target = 17;

    public static void main(String[] args) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    System.out.println("Answer: " + nums[i] + " at position " + i + " and " + nums[j] + " at position " + j);
                }
            }
        }
    }
}
