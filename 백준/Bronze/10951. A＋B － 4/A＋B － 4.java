import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            try {
                StringTokenizer st = new StringTokenizer(br.readLine());
                System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            } catch (NullPointerException e) {
                break;
            }
        }
    }
}