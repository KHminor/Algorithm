import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        Boolean state = false;
        ArrayList<String> li = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = String.valueOf(br.readLine().charAt(0));
            if (map.containsKey(name)) {
                map.put(name, map.get(name)+1);
                if (map.get(name) == 5) {
                    state = true;
                    li.add(name);
                }
            } else {
                map.put(name, 1);
            }
        }

        if (state) {
            Collections.sort(li);
            for (int i = 0; i < li.size(); i++) {
                System.out.print(li.get(i));
            }
        } else {
            System.out.println("PREDAJA");
        }
    }
}