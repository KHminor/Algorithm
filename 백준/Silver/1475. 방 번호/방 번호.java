import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int[] li = new int[10];

        while (n!=0) {
            int num = n%10;
            if (num==6 || num==9) {
                if (li[6]>li[9]) li[9]+=1;
                else li[6]+=1;
            } else li[num]+=1;
            n /= 10;
        }
        for (int num: li) result = Math.max(result, num);
        System.out.println(result);
    }
}
