package com.leetcode.pratice;

public class SingleNumber
{
    public static void main(String args[])
    {
        int[] nums = {1,1,2,2,1,3,3,5};
        for(int j = 0; j < nums.length; j++)
        {
            int count = 0;

            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.println(nums[j]);
                break;
            }
        }
    }
}
