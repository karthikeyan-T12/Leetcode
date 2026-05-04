package Leetcode;
import java.util.Arrays;
class removing{
    public int removeduplice(int[] nums){
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                nums[++j]=nums[i];
            }
            System.out.println(Arrays.toString(nums));
        }
        return ++j;
    }
}
class exp26 {
    public static void main(String args[]){
        removing r1=new  removing();
        int g=r1.removeduplice(new int[]{1,1,2,3,4,5,5,6,7,7,7,});
        System.out.println(g);
    }
}
