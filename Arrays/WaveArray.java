package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Vishal Singh */

public class WaveArray {
    public static void main(String[] args)throws IOException {
        /*
         * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it.
         * In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing lexicographical order).
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            for (int i = 0; i < n-1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
