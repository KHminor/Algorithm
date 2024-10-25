import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cnt_li = new int[NK[0]+NK[2]+1];
        cnt_li[1] = 1;
        for (int i=2; i<=NK[0]+NK[2]; i++) cnt_li[i] = cnt_li[i-1]+i;
        int[] li = new int[cnt_li[NK[0]+NK[2]]];
        Arrays.fill(li,1);

        for (int i=3; i<=NK[0]+NK[2]; i++) {
            for (int j=1; j<i-1; j++) li[cnt_li[i-1]+j] = li[cnt_li[i-2]+j-1]+li[cnt_li[i-2]+j];
        }
        int result = 0;
        int cnt = 1;
        for (int i=NK[0]-1; i<NK[0]+NK[2]-1; i++) {
            for (int j=NK[1]-1; j<NK[1]-1+cnt; j++) result += li[cnt_li[i]+j];
            cnt ++;
        }
        System.out.println(result);
    }
}
