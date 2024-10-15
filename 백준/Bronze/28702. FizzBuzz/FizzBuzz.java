import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> s_li = new ArrayList<>(){{
           add("FizzBuzz");
           add("Fizz");
           add("Buzz");
        }};
        
        int num = 0;
        int idx = -1;

        for (int i=0; i<3; i++) {
            String inp = br.readLine();
            if (!s_li.contains(inp)) {
                num = Integer.parseInt(inp);
                idx = i;
            }
        }
        
        for (int i=idx+1; i<3; i++) num++;
        num++;

        if (num%3==0 && num%5==0) System.out.println(s_li.get(0));
        else if (num%3==0) System.out.println(s_li.get(1));
        else if (num%5==0) System.out.println(s_li.get(2));
        else System.out.println(num);
    }
}
