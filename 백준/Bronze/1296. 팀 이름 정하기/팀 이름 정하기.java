import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeon = br.readLine();
        ArrayList<Integer> li = new ArrayList<>(Collections.nCopies(4,0));
        find(yeon, li);

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> name_li = new ArrayList<>();
        for (int i = 0; i < n; i++) name_li.add(br.readLine());
        Collections.sort(name_li);
        Long result = 0L;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> new_li = (ArrayList<Integer>) li.clone();
            find(name_li.get(i), new_li);
            Long gob = 1L;
            for (int j = 0; j < 3; j++) {
                for (int k = j+1; k < 4; k++) {
                    gob *= (long) (new_li.get(j)+new_li.get(k));
                }
            }
            if (gob%100 > result) {
                result = gob%100;
                idx = i;
            }
        }
        System.out.println(name_li.get(idx));
    }

    public static void find(String name, ArrayList<Integer> li) {
        for (char i: name.toCharArray()) {
            if (i == 'L') li.set(0, li.get(0)+1);
            else if (i == 'O') li.set(1, li.get(1)+1);
            else if (i == 'V') li.set(2, li.get(2)+1);
            else if (i == 'E') li.set(3, li.get(3)+1);
        }
    }
}