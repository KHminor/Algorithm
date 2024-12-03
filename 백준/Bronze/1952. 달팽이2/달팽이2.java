import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[][] visit = new boolean[M][N];
        int[] ni = {0,1,0,-1};
        int[] nj = {1,0,-1,0};
        int[] now = {0,0};
        visit[0][0]=true;
        int result = 0;
        int n_idx = 0;
        int cnt = 1;
        while (cnt!=M*N) {
            if((0<=now[0]+ni[n_idx] && now[0]+ni[n_idx]<M) && (0<=now[1]+nj[n_idx] && now[1]+nj[n_idx]<N) && !visit[now[0]+ni[n_idx]][now[1]+nj[n_idx]]) {
                now[0]=now[0]+ni[n_idx];
                now[1]=now[1]+nj[n_idx];
                visit[now[0]][now[1]]=true;
                cnt++;
            } else {
                n_idx=(n_idx+1)%4;
                result++;
            }
        }
        System.out.println(result);
    }
}
