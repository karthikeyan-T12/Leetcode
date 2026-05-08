package Leetcode;

public class traget2798
{
    public static void main(String args[])
    {
        int nums[]={1,2,5,1,3};
        int total=3;
        int value=0;
        for(int b:nums)
        {
            if(b>=total)
            {
                value++;
            }
        }
        System.out.println(value);
    }
}
