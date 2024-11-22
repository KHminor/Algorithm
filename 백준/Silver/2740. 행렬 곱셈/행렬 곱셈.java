import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int[][] li1 = new int[N][M1];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M1; j++) li1[i][j]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int M2 = Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        int[][] li2 = new int[M2][K];
        for (int i=0; i<M2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<K; j++) li2[i][j]=Integer.parseInt(st.nextToken());
        }
        int[][] result = new int[N][K];
        for (int i=0; i<K; i++) { // 0 1 2
            for (int j=0; j<M1; j++) { // 0 1
                for (int x=0; x<N; x++) { // 0 1 2
                    result[x][i]+=li2[j][i]*li1[x][j];
                }
            }
        }
        for (int num[]: result) {
            for (int n: num) bw.write(n+" ");
            bw.write("\n");
        }
        bw.flush();
    }
}