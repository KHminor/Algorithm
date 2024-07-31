import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s_br = br.readLine().split(" ");
        int a = Integer.parseInt(s_br[0]);
        int b = Integer.parseInt(s_br[1]);
        int v = Integer.parseInt(s_br[2]);
        if ((v-a)%(a-b) != 0) System.out.println((v-a)/(a-b)+2);
        else System.out.println((v-a)/(a-b)+1);
    }
}