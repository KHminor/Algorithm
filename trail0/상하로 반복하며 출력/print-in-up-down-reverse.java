import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            int cnt = 1;
            if (i%2==0) {
                for (int j=0; j<n; j++) {
                    arr[j][i] = cnt++;
                }
            } else {
                for (int j=n-1; j>=0; j--) {
                    arr[j][i] = cnt++;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}