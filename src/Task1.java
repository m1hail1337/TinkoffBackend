import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        Set<Character> set = new HashSet<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        int begin = 1;
        for (char i : str) {
            List<Character> test = new ArrayList<>(10);
            int end = begin + 9;
            test.add(i);
            for (int start = begin; start < end; start++) {
                test.add(str[start]);
            }
            Set<Character> testSet = new HashSet<>();
            test.forEach(it -> {
                if (set.contains(it)) {
                    testSet.add(it);
                }
            });
            int questions = (int) test.stream().filter(it -> !set.contains(it)).count();
            if (testSet.size() + questions == 10){
                System.out.println("YES");
                return;
            } else if (begin == str.length-10) {
                System.out.println("NO");
                return;
            } else begin++;
        }
    }
}

