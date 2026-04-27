package Leetcode;

public class alternativesum
{
    public static void main(String args[])
    {
        int[] nums={1,3,5,7};
        int sum=0;
        int i=0;
        int j=1;
        int le=nums.length;
        boolean c=true;
        while(c) {
            if (j <= le) {
                int total = nums[i] - nums[j];
                sum += total;
                i += 2;
            }
            else
            {
                System.out.println(nums[i]);
                c=false;
            }
        }
        System.out.println(sum);
    }
}
