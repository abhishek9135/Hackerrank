import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 0;
        double posnumber = 0,negnumber = 0,zernumber = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scan.nextInt();}
    
        for(int i = 0; i < n; i++){
            if(ar[i] > 0)
                   posnumber += 1 ;
            else if(ar[i] < 0)
                    negnumber += 1;
            else if(ar[i] == 0)
                    zernumber += 1;
        }
        System.out.println(posnumber/n);
        System.out.println(negnumber/n);
        System.out.println(zernumber/n);
        
    }
}