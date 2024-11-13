import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        int T = sc.nextInt();
        while (T>0) {
            int cash = sc.nextInt();
            sb = new StringBuilder();
            if (cash/25!=0) {
                sb.append(cash/25+" ");
                cash%=25;
            } else sb.append(0+" ");
            if (cash/10!=0) {
                sb.append(cash/10+" ");
                cash%=10;
            } else sb.append(0+" ");
            if (cash/5!=0) {
                sb.append(cash/5+" ");
                cash%=5;
            } else sb.append(0+" ");
            sb.append(cash);
            bw.write(sb+"\n");
            T--;
        }
        bw.flush();
    }
}
