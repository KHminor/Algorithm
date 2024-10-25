import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt_li = new int[NK[0]+1];
        cnt_li[1] = 1;
        for (int i=2; i<=NK[0]; i++) cnt_li[i] = cnt_li[i-1]+i;
        int[] li = new int[cnt_li[NK[0]-1]];
        Arrays.fill(li,1);

        if (NK[0]>2 && NK[1]!=1 && NK[1]!=NK[0]) {
            for (int i=3; i<NK[0]; i++) {
                for (int j=1; j<i-1; j++) li[cnt_li[i-1]+j] = li[cnt_li[i-2]+j-1]+li[cnt_li[i-2]+j];
            }
            System.out.println(li[cnt_li[NK[0]-2]+NK[1]-2]+li[cnt_li[NK[0]-2]+NK[1]-1]);
        } else System.out.println(1);
    }
}
