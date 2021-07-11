package com.dongci777;

/**
 * @Author: zxb
 * @Date : 2021/7/11 8:10 下午
 */

/**
 * 时间复杂度：O（n）
 * 空间复杂度：O（1）
 */
public class DuplicateNumberInArray {

    public static boolean duplicate(int[] nums, int length, int[] duplications) {
        // 1、检验数组是否为空
        if (nums == null || length <= 0) {
            System.out.println("Arrays cannot be empty...") ;
            return false;
        }

        // 2、检验数组中的数字
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0 || nums[i] > length - 1) {
                System.out.println("The numbers in the array given do not qualify...");
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplications[0] = nums[i];
                    System.out.printf("Duplicate number is：" + duplications[0]);
                    return true;
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        System.out.println("No duplicate numbers found...");
        return false;
    }

    public static void main(String[] args) {
//        int[] nums = {2, 3, 1, 0, 2, 5, 3};
//        int length = nums.length;
//        int[] duplications = new int[1];
//        duplicate(nums, length, duplications);

//        int[] nums = {-1, 3, 1, 0, 2, 5, 3};
//        int length = nums.length;
//        int[] duplications = new int[1];
//        duplicate(nums, length, duplications);

        int[] nums = {0, 3, 1, 4, 2, 5, 6};
        int length = nums.length;
        int[] duplications = new int[1];
        duplicate(nums, length, duplications);
    }
}
