package day20201203;

import java.io.*;
import java.util.StringTokenizer;
 
public class Dice_1175
{
    static int[] arr;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
         
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
         
        while(true) {
        	boolean isFinish = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] < 6) {
                    isFinish = false;
                    break;
                }
            }
             
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
             
            if(sum == m) {
                for(int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            if(isFinish) break;
             
            arr[arr.length-1]++;
             
            for(int i = arr.length - 1; i > 0; i--) {
                if(arr[i] > 6) {
                    arr[i - 1]++;
                    arr[i] = 1;
                }
            }
        }
    }
}