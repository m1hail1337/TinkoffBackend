import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.min;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int currentSum = 0;
        List<Integer> minData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            char b = input[1].charAt(0);
            currentSum += a;
            if (b == '-') {
                minData.add(-currentSum);
            }
        }
        if (minData.size() == 0) {
            System.out.println("inf");
        } else {
            int maxTemp = min(minData) - 1;
            System.out.println(currentSum + maxTemp);
        }
    }
}
