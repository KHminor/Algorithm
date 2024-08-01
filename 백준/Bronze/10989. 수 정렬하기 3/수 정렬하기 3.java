import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] li = new int[10001];

        // 배열에 입력 값 저장
        for (int i=0; i<n; i++) li[Integer.parseInt(br.readLine())]++;

        for (int i=0; i<10001; i++) {
            while (li[i] != 0) {
                bw.write(i+"\n");
                li[i]--;
            }
        }

        bw.flush();

    }
}
