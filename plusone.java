
import java.util.Arrays;

class solve {
    public int[] onepluse(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
}

public class plusone{
    public static void main(String[] args) {
        solve s1=new solve();
        int[] hat={1,3,2};
        /*System.out.println(s1.onepluse(hat));*/
        System.out.println(Arrays.toString(s1.onepluse(hat)));
    }

}