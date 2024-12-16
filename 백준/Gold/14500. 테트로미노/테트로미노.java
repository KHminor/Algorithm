import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int[][][][] li;
    static int[][] mtx;
    static int N;
    static int M;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        li = new int[5][][][];
        addDefault();
        findTetro();
        System.out.println(result);
    }

    private static void addDefault() throws IOException {
        li[0] = new int[][][] {
                {{0, 0}, {0, 1}, {0, 2}, {0, 3}},
                {{0, 0}, {1, 0}, {2, 0}, {3, 0}}
        };
        li[1] = new int[][][] {
                {{0, 0}, {0, 1}, {1, 1}, {1, 0}}
        };
        li[2] = new int[][][] {
                {{0, -1}, {0, 0}, {0, 1}, {1, 0}},
                {{0, -1}, {0, 0}, {-1, 0}, {1, 0}},
                {{0, -1}, {0, 0}, {-1, 0}, {0, 1}},
                {{-1, 0}, {0, 0}, {0, 1}, {1, 0}}
        };
        li[3] = new int[][][] {
                {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
                {{0, 0}, {1, 0}, {1, -1}, {2, -1}},
                {{0, 0}, {0, 1}, {-1, 1}, {-1, 2}},
                {{0, 0}, {0, 1}, {1, 1}, {1, 2}}
        };
        li[4] = new int[][][] {
                {{0, 0}, {1, 0}, {2, 0}, {2, 1}},
                {{0, 0}, {1, 0}, {2, 0}, {2, -1}},
                {{0, 0}, {1, 0}, {0, 1}, {0, 2}},
                {{0, 0}, {1, 0}, {0, -1}, {0, -2}},
                {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
                {{0, 0}, {0, -1}, {1, -1}, {2, -1}},
                {{0, 0}, {-1, 0}, {0, -1}, {0, -2}},
                {{0, 0}, {-1, 0}, {0, 1}, {0, 2}}
        };

        mtx = new int[N][M];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; j++) mtx[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    private static void findTetro() {
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                detailTetro(i,j);
            }
        }
    }

    private static void detailTetro(int i, int j) {
        for (int t=0; t<5; t++) { // 각 도형
            for (int x=0; x<li[t].length; x++) { // 도형 별 회전&대칭
                boolean state = true;
                int hap = 0;
                for (int y=0; y<4; y++) {
                    if ((0<=i+li[t][x][y][0]&&i+li[t][x][y][0]<N)&&(0<=j+li[t][x][y][1]&&j+li[t][x][y][1]<M)) hap+=mtx[i+li[t][x][y][0]][j+li[t][x][y][1]];
                    else {
                        state = false;
                        break;
                    }
                }
                if (state&&hap>result) result = hap;
            }
        }
    }
}
