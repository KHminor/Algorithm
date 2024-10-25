import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int[][] li = new int[K+1][2];
        li[0] = new int[]{1,0};
        li[1] = new int[]{0,1};
        if (K>=2) {
            for (int i=2; i<=K; i++) li[i] = new int[]{li[i-1][0]+li[i-2][0], li[i-1][1]+li[i-2][1]};
        }
        System.out.println(Arrays.stream(li[K]).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}