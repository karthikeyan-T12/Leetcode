package Leetcode;
import java.util.Arrays;
class twopo{
    public int removeelement(int[] nums,int valus){
        int index=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=valus){
                nums[index]=nums[i];
                index++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return index;
    }
}
public class remov{
    public static void main(String[] args) {
        twopo t1=new twopo();
        int[] h={3,2,2,3};
        int g=t1.removeelement(h,3);
        System.out.println(g);

        
    }
}