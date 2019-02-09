import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=0,j;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for(int i = 0; i < n; i++){
            for(j = 1; j<=n; j++)
                System.out.print(j<n-i?" ":"#");
            System.out.println("");
        }
  }    
 }
           



