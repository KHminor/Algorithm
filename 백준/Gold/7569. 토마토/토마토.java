import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] MNH = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][][] mtx = new int[MNH[2]][MNH[1]][MNH[0]];
        int[] nj = {-1,0,1,0};
        int[] nk = {0,1,0,-1};
        Deque<List<Integer>> dq = new ArrayDeque<>();
        StringTokenizer st;
        int cnt = 0;
        for (int i=0; i<MNH[2]; i++) {
            for (int j=0; j<MNH[1]; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<MNH[0]; k++) {
                    mtx[i][j][k] = Integer.parseInt(st.nextToken());
                    if (mtx[i][j][k]==1) dq.add(new ArrayList<>(Arrays.asList(i,j,k,0)));
                    else if (mtx[i][j][k]==0) cnt++;
                }
            }
        }

        int result = 0;

        while (true) {

            if (dq.isEmpty()) break;
            while (!dq.isEmpty()) {
                List<Integer> li = dq.pollFirst();
                if (li.get(3) > result) result = li.get(3);
                for (int x=0; x<4; x++) {
                    if ((0<=li.get(1)+nj[x] && li.get(1)+nj[x]<MNH[1]) && (0<=li.get(2)+nk[x] && li.get(2)+nk[x]<MNH[0]) && mtx[li.get(0)][li.get(1)+nj[x]][li.get(2)+nk[x]]==0) {
                        mtx[li.get(0)][li.get(1)+nj[x]][li.get(2)+nk[x]] = 1;
                        dq.add(new ArrayList<>(Arrays.asList(li.get(0), li.get(1)+nj[x], li.get(2)+nk[x], li.get(3)+1)));
                        cnt--;
                    }
                }
                if (0<=li.get(0)-1 && mtx[li.get(0)-1][li.get(1)][li.get(2)]==0) {
                    mtx[li.get(0)-1][li.get(1)][li.get(2)] = 1;
                    dq.add(new ArrayList<>(Arrays.asList(li.get(0)-1, li.get(1), li.get(2), li.get(3)+1)));
                    cnt--;
                }
                if (li.get(0)+1<MNH[2] && mtx[li.get(0)+1][li.get(1)][li.get(2)]==0) {
                    mtx[li.get(0) + 1][li.get(1)][li.get(2)] = 1;
                    dq.add(new ArrayList<>(Arrays.asList(li.get(0)+1, li.get(1), li.get(2), li.get(3)+1)));
                    cnt--;
                }
            }
        }

        System.out.println(cnt!=0?-1:result);
    }
}
