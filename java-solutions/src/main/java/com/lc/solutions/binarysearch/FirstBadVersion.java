package com.lc.solutions.binarysearch;

public class FirstBadVersion
{
    public static int firstBadVersion(int n)
    {
        int start = 1;
        int end = n - 1;

        while (start <= end)
        {
            int middle = (start + (end - start) / 2);

            if (isBadVersion(middle))
            {
                end = middle - 1;
            }
            else
            {
                start = middle + 1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int version)
    {
        return version > 3;
    }

    public static void main(String[] args)
    {
        System.out.println(firstBadVersion(5));
    }
}
