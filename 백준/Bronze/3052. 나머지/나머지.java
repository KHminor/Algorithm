import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            li.add(Integer.parseInt(br.readLine())%42);
        }

        HashSet<Integer> hs = new HashSet<>(li);
        System.out.println(hs.size());
    }
}
