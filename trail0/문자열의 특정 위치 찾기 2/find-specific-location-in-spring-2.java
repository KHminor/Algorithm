import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);
        String[] li = {"apple", "banana", "grape", "blueberry", "orange"};
        int result = 0;

        for (int i=0; i<5; i++) {
            if (li[i].charAt(2) == val || li[i].charAt(3) == val) {
                System.out.println(li[i]);
                result++;
            }
        }
        System.out.println(result);
    }
}