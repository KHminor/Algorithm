import java.io.*;
import java.util.*;

public class Main {
    private static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] li = new int[n];
        int[] change_li = new int[n];
        boolean[] check = new boolean[n];
        for (int i=0; i<n; i++) li[i] = Integer.parseInt(st.nextToken());
        find_li(n, 0, li, check, change_li);
        System.out.println(result);

    }

    public static void find_li(int n, int now_i, int[] li, boolean[] check, int[] change_li) {
        if (now_i == n) result = Math.max(result, abs_sum(change_li));
        else {
            for (int i=0; i<n; i++) {
                if (!check[i]) {
                    check[i] = true;
                    change_li[now_i] = li[i];
                    find_li(n, now_i+1, li, check, change_li);
                    change_li[now_i] = 0;
                    check[i] = false;
                }
            }
        }
    }

    public static int abs_sum(int[] li) {
        int hap = 0;
        for (int i=0; i<li.length-1; i++) hap += Math.abs(li[i]-li[i+1]);
        return hap;
    }
}
