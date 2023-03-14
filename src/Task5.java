import java.util.Scanner;

import static java.lang.Math.max;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputString = sc.nextLine().split(" ");
        int[] arrayNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            arrayNumbers[i] = Integer.parseInt(inputString[i]);
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int sumMod = 0;
            for (int j = 0; j < n; j++) {
                int intMod = arrayNumbers[j] / arrayNumbers[i];
                sumMod += intMod * arrayNumbers[i];
            }
            result = max(result, sumMod);
        }
        System.out.println(result);
    }
}

