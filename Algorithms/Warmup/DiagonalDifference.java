import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,d1,d2;
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    int[][] ar = new int[n][n];
    for (int i = 0; i<n; i++) 
      for(int j = 0; j<n; j++) {
        ar[i][j] = scan.nextInt();
      }
        
        d1 = 0;
        for(int i = 0; i < n; i++)
                d1 += ar[i][i];
        d2 = 0;
        for(int i = n-1; i >= 0; i--)
            d2 += ar[i][n-i-1];
        System.out.println(Math.abs(d1 - d2));
    }
}