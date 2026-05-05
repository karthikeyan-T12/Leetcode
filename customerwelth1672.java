package Leetcode;

public class customerwelth1672
{
    public static void main(String[] args)
    {
        int accounts[][] = {{1,5},{7,3},{3,5}};
        int result=0;
        for(int[] rows : accounts)
        {
            int total=0;
            for(int w : rows)
            {
                total+=w;
            }
            if(result<total)
            {
                result=total;
            }
        }
        System.out.println(result);
    }
}
