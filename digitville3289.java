package Leetcode;
import java.util.*;

public class digitville3289
{
    public static void main(String[] args)
    {
        int nums[]={1,2,3,5,3,2};
//        List<Integer> result = new ArrayList<>();
        int result[]=new int[2];
        int k=0;
        int value = nums.length;
        for(int i=0; i<value; i++)
        {
            for(int j=i+1; j<value ; j++)
            {
                if(nums[i]==nums[j])
                {
                    result[k++]=nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
