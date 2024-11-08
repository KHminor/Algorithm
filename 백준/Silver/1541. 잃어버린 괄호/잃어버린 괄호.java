import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ipt = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] now = {0,0};
        int idx = 0;
        for (char i: ipt) {
            if (i=='-'||i=='+') {
                now[idx]+= Integer.parseInt(sb.toString());
                if (i=='-' && idx!=1) idx = (idx+1)%2;
                sb.delete(0,sb.length());
            }
            else sb.append(i);
        }
        now[idx]+= Integer.parseInt(sb.toString());
        System.out.println(now[0]-now[1]);
    }
}
