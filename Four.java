import java.util.*;
public class Four {
    public static void main(String args[]) {
        /*
        * Input: An array of n length.
        * Output: An Increment of given array.
        * Algorithum: 
        [1,2,3] = [1,2,4]
        [9,9,9]=[1,0,0,0]
        */
        int[] arr = {9,9,9};
        int num=0;
        for(int a: arr)
            num = 10 * num + a;
        System.out.println("Input Given:"+num);
        num++;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do {
            array.add(num%10);
            num /=10;
        } while(num > 0);
        Collections.reverse(array);
        System.out.println("Output:"+array);
    }
}