import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inp = br.readLine();
        while (true) {
            if (inp.length()<=10) {
                bw.write(inp);
                break;
            }
            bw.write(inp.substring(0,10)+"\n");
            inp = inp.substring(10);
        }
        bw.flush();
    }
}
