import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] result = new int[n];
            int tempResult = a;
            for (int j = 0; j < n; j++) {
                result[j] = tempResult + (int) Math.pow(2, j) * b;
                tempResult = result[j];
                if (j == n - 1){
                    for(int integer: result){
                        System.out.print(integer);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
            }
        }
        in.close();
    }
}
