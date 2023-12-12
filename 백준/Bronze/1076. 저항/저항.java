import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer[]> map = new HashMap<>();
        map.put("black", new Integer[]{0,1});
        map.put("brown", new Integer[]{1,10});
        map.put("red", new Integer[]{2,100});
        map.put("orange", new Integer[]{3,1000});
        map.put("yellow", new Integer[]{4,10000});
        map.put("green", new Integer[]{5,100000});
        map.put("blue", new Integer[]{6,1000000});
        map.put("violet", new Integer[]{7,10000000});
        map.put("grey", new Integer[]{8,100000000});
        map.put("white", new Integer[]{9,1000000000});
        String result = "";
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println((long) Integer.parseInt(result) * map.get(br.readLine())[1]);
            } else {
                result = result.concat(map.get(br.readLine())[0].toString());
            }
        }
    }
}
