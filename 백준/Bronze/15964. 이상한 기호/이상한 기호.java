import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] li = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        System.out.println((li[0]+li[1])*(li[0]-li[1]));
    }
}
