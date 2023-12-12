import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] val = br.readLine().split(" ");
        ArrayList<Integer> li = new ArrayList<>(val.length);

        for (int i = 0; i < val.length; i++) li.add(Integer.parseInt(val[i]));

        Collections.sort(li);
        Integer num = li.get(0);
        while (true) {
            if (find(num, li)) {
                System.out.println(num);
                break;
            }
            num ++;
        }

    }
    public static Boolean find(Integer num, ArrayList<Integer> li) {
        for (int i = 0; i < 3; i++) {
            if (num % li.get(i) != 0) continue;
            for (int j = i+1; j < 4; j++) {
                if (num % li.get(j) != 0) continue;
                for (int k = j+1; k < 5; k++) {
                    if (num % li.get(k) == 0) return true;
                }
            }
        }
        return false;
    }
}