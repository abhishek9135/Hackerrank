import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long inputArray[] = new long[n+1];
    while(m-->0) {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int value=sc.nextInt();
      inputArray[a-1]+=value;
      inputArray[b]-=value;
    }
    long max=getMax(inputArray);
    System.out.println(max);
    sc.close();
  }

  private static long getMax(long[] inputArray) {
    long max=Long.MIN_VALUE;
    long sum=0;
    for(int i=0;i<inputArray.length;i++) {
      sum+=inputArray[i];
      max=Math.max(max, sum);
    }
    return max;
  }
}