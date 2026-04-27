package Leetcode;
import java.util.Arrays;
class Solution{
    public int[] twosum(int[] num,int count){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((num[i]+num[j])==count){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
public class addnum{
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] a={3,2,4};
        int[] b=s1.twosum(a,6);
        System.out.println(Arrays.toString(b));        
    }
}















