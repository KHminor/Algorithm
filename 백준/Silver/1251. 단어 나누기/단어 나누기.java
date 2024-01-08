import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        Integer x_ln = x.length();

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < x_ln-2; i++) {
            for (int j = i+1; j < x_ln-1; j++) {
                for (int k = j+1; k < x_ln; k++) {
                    StringBuilder s1 = new StringBuilder(x.substring(0,i+1)).reverse();
                    StringBuilder s2 = new StringBuilder(x.substring(i+1,j+1)).reverse();
                    StringBuilder s3 = new StringBuilder(x.substring(j+1,x_ln)).reverse();

                    StringBuilder com = new StringBuilder();
                    com.append(s1).append(s2).append(s3);
                    result.add(com.toString());
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.get(0));
    }
}
