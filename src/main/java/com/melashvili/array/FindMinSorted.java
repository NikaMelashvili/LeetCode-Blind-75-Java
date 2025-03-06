package com.melashvili.array;

public class FindMinSorted {
    public static int[] nums1 = {3,4,5,1,2};

    public static int[] nums2 = {4,5,6,7,0,1,2};

    public static int[] nums3 = {11,13,15,17};

    public static void main( String[] args )
    {
        System.out.println(findMinON(nums1));
        System.out.println(findMinON(nums2));
        System.out.println(findMinON(nums3));

        System.out.println("--------------------------");

        System.out.println(findMinLogN(nums1));
        System.out.println(findMinLogN(nums2));
        System.out.println(findMinLogN(nums3));
    }

    public static int findMinON(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] < nums[i]) return nums[i + 1];
        }
        return nums[0];
    }

    public static int findMinLogN(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if  (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}
