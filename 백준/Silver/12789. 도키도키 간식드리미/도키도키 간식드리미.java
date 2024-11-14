import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] now = new int[N];
        int[] stay = new int[N];

        int n_idx = 0;
        int s_idx = 0;

        int s = 0;
        int cnt = 0;
        for (int i=0; i<N; i++) now[i]=sc.nextInt();

        while (cnt!=N) {
            cnt++;
            if (now[n_idx]==s+1) {
                n_idx++;
                s++;
                for (int j=s_idx-1; j>=0; j--) {
                    if (stay[j]==s+1) {
                        s++;
                        s_idx--;
                    } else break;
                }
            } else {
                stay[s_idx]=now[n_idx];
                s_idx++;
                n_idx++;
            }
        }
        if (N==s) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
