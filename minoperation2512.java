package Leetcode;

class minopp
{
    public int operation(int[] nums,int k)
    {
        int sum = 0;
        for(int n:nums)
        {
            sum+=n;
        }
        return sum%k;
    }
}

public class minoperation2512
{
    public static void main(String[] args)
    {
        minopp o1 = new minopp();
        int nu[]={3,9,7};
        int result= o1.operation(nu,5);
        System.out.println(result);
    }

}
