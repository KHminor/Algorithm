import java.io.*;
import java.util.*;
public class Main {
    private static boolean state = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hap = 100;
        int[] nine_sp = new int[9];
        int[] sevn_sp = new int[7];
        for (int i=0; i<9; i++) nine_sp[i] = Integer.parseInt(br.readLine());
        find_sevn(0, 0, 0, nine_sp, sevn_sp);
        Arrays.sort(sevn_sp);
        for (int num: sevn_sp) bw.write(num+"\n");
        bw.flush();
        bw.close();
    }

    public static void find_sevn (int n_now, int s_now, int hap, int[] nine_sp, int[] sevn_sp) {
        if (hap == 100 && s_now == 7) state = true;
        else {
            for (int i=n_now; i<9; i++) {
                if (!state && s_now < 7 && hap+nine_sp[i] <= 100) {
                    sevn_sp[s_now] = nine_sp[i];
                    find_sevn(i+1, s_now+1,hap+nine_sp[i], nine_sp, sevn_sp);
                    if (!state) sevn_sp[s_now] = 0;
                }
            }
        }
    }
}
