import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int score = Integer.parseInt(st.nextToken());
        if (score >= 90) System.out.println('A');
        else if (score >= 80) System.out.println('B');
        else if (score >= 70) System.out.println('C');
        else if (score >= 60) System.out.println('D');
        else System.out.println('F');
    }
}