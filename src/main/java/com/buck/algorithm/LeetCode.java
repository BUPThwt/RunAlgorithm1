package com.buck.algorithm;

import com.buck.algorithm.leetcode.TwoSum;

public class LeetCode {











    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.print("result:"+result[0]+","+result[1]);
    }
}
