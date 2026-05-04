package Leetcode;

public class concatination1929
{
    public static void main(String args[]){
    int nums[] = {1,2,2,1};
    int n = nums.length;
    int two[]=new int[n*2];
    for(int i=0; i<n; i++)
    {
        two[i] = nums[i];
        two[i+n]=nums[i];
    }
    }
}
