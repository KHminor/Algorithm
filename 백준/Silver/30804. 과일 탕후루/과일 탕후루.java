import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] li;
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        addFruits(N);
        System.out.println(findManyFruits(N));
    }


    private static void addFruits(int N) throws IOException {
        li = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) li[i]=Integer.parseInt(st.nextToken());
    }

    private static int findManyFruits(int N) {
        Map<Integer, Integer> fruits = new HashMap<>();
        int result = 0;
        int s = 0;
        for (int e=0; e<N; e++) {
            fruits.put(li[e],fruits.getOrDefault(li[e],0)+1);
            while (fruits.size()>2) {
                fruits.put(li[s],fruits.get(li[s])-1);
                if (fruits.get(li[s])==0) fruits.remove(li[s]);
                s++;
            }
            if (e-s+1>result) result = e-s+1;
        }
        return result;
    }
}