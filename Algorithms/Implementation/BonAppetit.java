import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BonAppétit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bCharged = 0, sum = 0, bActual = 0;
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            if (k != i)
                sum += cost;
        }
        bActual = sum / 2;
        bCharged = sc.nextInt();
        if (bActual == bCharged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bCharged - bActual);
        }
        sc.close();
    }
}