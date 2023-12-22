import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer[]> move = new HashMap<>();
        move.put("T", new Integer[]{1, 0});
        move.put("B", new Integer[]{-1, 0});
        move.put("L", new Integer[]{0, -1});
        move.put("R", new Integer[]{0, 1});
        move.put("LT", new Integer[]{1, -1});
        move.put("RT", new Integer[]{1, 1});
        move.put("LB", new Integer[]{-1, -1});
        move.put("RB", new Integer[]{-1, 1});

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        String k = st1.nextToken();
        String s = st1.nextToken();
        String n = st1.nextToken();

        ArrayList<Integer> k_pos = new ArrayList<>(Arrays.asList(Integer.parseInt(k.substring(1)), (int) k.charAt(0) - 64));
        ArrayList<Integer> s_pos = new ArrayList<>(Arrays.asList(Integer.parseInt(s.substring(1)), (int) s.charAt(0) - 64));

        for (int i = 0; i < Integer.parseInt(n); i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            Integer[] next = move.get(st2.nextToken());
            if ((1 <= k_pos.get(0) + next[0] && k_pos.get(0) + next[0] <= 8) && 1 <= k_pos.get(1) + next[1] && k_pos.get(1) + next[1] <= 8) {
                if ((k_pos.get(0) + next[0] == s_pos.get(0) && k_pos.get(1) + next[1] == s_pos.get(1)) && ((1 <= s_pos.get(0) + next[0] && s_pos.get(0) + next[0] <= 8) && 1 <= s_pos.get(1) + next[1] && s_pos.get(1) + next[1] <= 8)) {
                    s_pos.set(0, s_pos.get(0) + next[0]);
                    s_pos.set(1, s_pos.get(1) + next[1]);
                } else if ((k_pos.get(0) + next[0] == s_pos.get(0) && k_pos.get(1) + next[1] == s_pos.get(1)) && !((1 <= s_pos.get(0) + next[0] && s_pos.get(0) + next[0] <= 8) && 1 <= s_pos.get(1) + next[1] && s_pos.get(1) + next[1] <= 8)) {
                    continue;
                }
                k_pos.set(0, k_pos.get(0) + next[0]);
                k_pos.set(1, k_pos.get(1) + next[1]);
            }
        }

        System.out.print((char) (k_pos.get(1) + 64));
        System.out.println(k_pos.get(0));
        System.out.print((char) (s_pos.get(1) + 64));
        System.out.println(s_pos.get(0));
    }
}
