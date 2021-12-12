package com.lc.solutions.binarysearch;

import java.util.Arrays;

public class SortedSquares
{
    public static int[] sortedSquares(int[] nums)
    {
        int[] sortedSquares = new int[nums.length];
        int i = 0;

        if (nums.length == 0)
            return sortedSquares;

        int firstNaturalNumIndex = 0;

        if (nums[nums.length - 1] > 0)
        {
            while (firstNaturalNumIndex < nums.length && nums[firstNaturalNumIndex] < 0)
                firstNaturalNumIndex++;
        }
        else
        {
            firstNaturalNumIndex = nums.length;
        }

        int naturalNumIndex = firstNaturalNumIndex;
        int nonNaturalNumIndex = firstNaturalNumIndex - 1;

        while (naturalNumIndex < nums.length && nonNaturalNumIndex > -1)
        {
            if (Math.abs(nums[naturalNumIndex]) > Math.abs(nums[nonNaturalNumIndex]))
            {
                sortedSquares[i] = (int) Math.pow(nums[nonNaturalNumIndex], 2);
                nonNaturalNumIndex--;
            }
            else
            {
                sortedSquares[i] = (int) Math.pow(nums[naturalNumIndex], 2);
                naturalNumIndex++;
            }

            i++;
        }

        while (naturalNumIndex < nums.length)
        {
            sortedSquares[i] = (int) Math.pow(nums[naturalNumIndex], 2);
            naturalNumIndex++;
            i++;
        }

        while (nonNaturalNumIndex > -1)
        {
            sortedSquares[i] = (int) Math.pow(nums[nonNaturalNumIndex], 2);
            nonNaturalNumIndex--;
            i++;
        }

        return sortedSquares;
    }

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-5, -3, -2, -1})));
    }
}
