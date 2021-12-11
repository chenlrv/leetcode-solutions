package com.lc.solutions.binarysearch;

public class BinarySearch
{
    public static int search(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if (nums[mid] > target)
            {
                end = mid - 1;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(search(new int[]{1, 3, 4, 2, 0}, 4));
    }
}
