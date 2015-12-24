import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++) {
            d[i] = scanner.nextInt();
        }
        
        int left = 0;
        int right = N-1;
        int i = 1;
        long res = 0;
        while(left <= right) {
            if(d[left] > d[right]) {
                res += d[left] * i;
                left++;
                i++;
            } 
            else if(d[left] < d[right]) {
                res += d[right] * i;
                right--;
                i++;
            } else {
                // d[left] == d[right]
                while(left < right && d[left] == d[right]) {
                    res += d[left] * i;
                    left++;
                    i++;
                    res += d[right] * i;
                    right--;
                    i++;
                }
                if(left == right && d[left] == d[right]){
                    res += d[left] * i;
                    left++;
                    i++;
                }
            }
        }
        System.out.println(res);
         
    }
}
