package com.melashvili.array;

import java.util.HashSet;

public class ContainsDuplicate {

    static int[] nums = {1, 7, 6, 9, 7};

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                System.out.println(num);;
            }
        }
    }
}
