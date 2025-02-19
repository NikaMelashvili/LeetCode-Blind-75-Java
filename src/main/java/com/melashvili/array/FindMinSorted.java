package com.melashvili.array;

public class FindMinSorted {
    public static int[] nums1 = {3,4,5,1,2};

    public static int[] nums2 = {4,5,6,7,0,1,2};

    public static int[] nums3 = {11,13,15,17};

    public static void main( String[] args )
    {
        System.out.println(findMin(nums1));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums3));
    }

    public static int findMin(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] < nums[i]) return nums[i + 1];
        }
        return nums[0];
    }
}
