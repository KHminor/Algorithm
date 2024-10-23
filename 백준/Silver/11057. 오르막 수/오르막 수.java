import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] li = {1,1,1,1,1,1,1,1,1,1};
        int cnt = 1;
        int result = 0;
        while (cnt!=N) {
            if (cnt+1==N) {
                for (int i=0; i<10; i++) {
                    for (int j=i+1; j<10; j++) {
                        li[i]+=li[j]%10007;

                    }
                    result+=li[i];
                }
            } else {
                for (int i=0; i<10; i++) {
                    for (int j=i+1; j<10; j++) li[i]+=li[j]%10007;
                }
            }
            cnt++;
        }
        System.out.println(N==1?10:result%10007);
    }
}
