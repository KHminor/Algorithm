import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        String[] result_li = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
        for (int t=1; t<=tc; t++) {
            int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = NK[0]; // 학생 수
            int K = NK[1]; // 찾을 학생 번호
            Float[] li = new Float[N];

            for (int i=0; i<N; i++) {
                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                li[i] = score(arr);
            }
            List<Float> sort_li = new ArrayList<>(Arrays.asList(li));
            Collections.sort(sort_li, Collections.reverseOrder());

            for (int j=0; j<N; j++) {
                if (li[K-1].equals(sort_li.get(j))) {
                    bw.write(String.format("#%d %s",t,result_li[j/(N/10)])+"\n");
                    break;
                }
            }
        }
        bw.flush();
    }

    public static Float score(int[] arr) {
        return (float) (arr[0]*0.35+arr[1]*0.45+arr[2]*0.2);
    }
}