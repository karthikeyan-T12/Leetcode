package Leetcode;

public class alternativesum
{
    public static void main(String args[])
    {
        int[] nums={1,1,2};
        int sum=0;
        int i=0;
        int j=1;
        int le=nums.length;
        while(j < le){
                int total = nums[i] - nums[j];
                sum += total;
                i += 2;
                j += 2;
        }
        if(i<le)
        {
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
