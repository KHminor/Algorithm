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
        for (int i=0; i<MNH[2]; i++) {
            for (int j=0; j<MNH[1]; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<MNH[0]; k++) {
                    mtx[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        int cnt = 0;

        // 안 익은 토마토 주위에 있는 익은 토마토 위치 추가, 안 익은 토마토 개수 체크
        for (int i=0; i<MNH[2]; i++) {
            for (int j=0; j<MNH[1]; j++) {
                for (int k=0; k<MNH[0]; k++) {
                    if (mtx[i][j][k]==1) {
//                        boolean state = false;
//                        for (int x=0; x<4; x++) {
//                            if ((0<=j+nj[x] && j+nj[x]<MNH[1]) && (0<=k+nk[x] && k+nk[x]<MNH[0]) && mtx[i][j+nj[x]][k+nk[x]]==0) {
//                                state = true;
//                                break;
//                            }
//                        }
//                        if (0<=i-1 && mtx[i-1][j][k]==1) state = true;
//                        else if (i+1<MNH[2] && mtx[i+1][j][k]==1) state = true;
//                        if (state)
                        dq.add(new ArrayList<>(Arrays.asList(i,j,k,0)));
                    }
                    else if (mtx[i][j][k]==0) cnt++;
                }
            }
        }

        int result = 0;

        while (true) {

            if (dq.isEmpty()) break;
            // 이제 익은 토마토 주위에 있는, 익지 않은 토마토 익히기
            while (!dq.isEmpty()) {
                List<Integer> li = dq.pollFirst();
                result = Math.max(result, li.get(3));
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
//            result ++;
//            cnt = 0;
        }

        System.out.println(cnt!=0?-1:result);
    }
}
