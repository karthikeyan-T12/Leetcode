package Leetcode;
import java.util.*;
public class finishing3668
{
    public static void main(String args[])
    {
        int me[]={1,4,5,3,2};
        int frinde[]={5,2};
        int total[] = new int[frinde.length];
        int v=0;
        HashSet<Integer> who = new HashSet<>();
        for(int b:frinde)
        {
            who.add(b);
        }
        for(int i=0; i<me.length; i++)
        {
            if(who.contains(me[i]))
            {
                total[v++]=me[i];
            }
        }
        System.out.println(Arrays.toString(total));
    }

}
