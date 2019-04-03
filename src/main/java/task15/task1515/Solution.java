package task15.task1515;

import java.util.Scanner;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;

    static
    {
        Scanner sc = new Scanner(System.in);

        try {
            A = sc.nextInt();
            B = sc.nextInt();

        } catch (Exception e) {
            System.err.println(e);
        } finally {
            sc.close();
        }
    }

    public static final int MIN = min(A, B);



    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
