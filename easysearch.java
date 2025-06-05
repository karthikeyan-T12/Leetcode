class sea1{
    public int searchinsert(int[] nums,int valus){
        int left=0;
        int mid=1;
        int right=nums.length;
        try{
            while(left<=right){
                if(nums[mid]==valus){
                    return mid;
                }
                else if(nums[mid]<valus){
                    ++mid;
                    left=mid;
                }
                else if(nums[mid]>valus){
                    --mid;
                    right=mid;
                }
            }
        }
        catch(Exception e){
            if(nums[0]>=valus){
                return 0;
            }

            else{
                return nums.length;
            }
        }
        return left;
    }
}
class solution{
    public int innserat(int nums[],int valus){
        int left =0;
        int right=nums.length;
        while(left<=right){
            int mid =left+(right-left)/2;
            System.out.println(mid);

            if(nums[mid]== valus){
                return mid;
            }
            else if(nums[mid]>valus){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
public class  easysearch{
    public static void main(String[] args){
        sea1 s1=new sea1();
        solution g1=new solution();
        int[] f={1};
        int r=s1.searchinsert(f,0);
        System.out.println(r);
    }
}