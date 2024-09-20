import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        int ln = inp.length();
        int moc = ln/10;
        for (int i=0; i<moc; i++) System.out.println(inp.substring(i*10,(i+1)*10));
        System.out.println(inp.substring(moc*10,ln));
    }
}
