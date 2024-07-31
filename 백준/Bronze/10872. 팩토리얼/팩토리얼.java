import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        sc.close();
    }

    public static int factorial(int num) {
        int cnt = num;
        int result = 1;
        while (cnt != 0) result *= cnt--;
        return result;
    }
}
