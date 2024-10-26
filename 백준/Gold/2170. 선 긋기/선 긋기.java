import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
           public int compare(int[] o1, int[] o2) {
               if (o1[0] != o2[0]) return Integer.compare(o1[0],o2[0]);
               else return Integer.compare(o2[1],o1[1]);
           }
        });

        int s = arr[0][0];
        int e = arr[0][1];
        int result = e-s;
        for (int i=1; i<N; i++) {
            if (s <= arr[i][0] && arr[i][1]<=e) continue;
            else if (e < arr[i][0]) {
                s = arr[i][0];
                e = arr[i][1];
                result += e-s;
            }
            else if (s <= arr[i][0] && e < arr[i][1]) {
                result += arr[i][1]-e;
                e = arr[i][1];
            }
        }
        System.out.println(result);
    }
}
