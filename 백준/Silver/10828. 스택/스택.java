import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        while (N!=0) {
            String[] now = br.readLine().split(" ");
            switch (now[0]) {
                case "push":
                    arr.add(Integer.parseInt(now[1]));
                    break;
                case "pop":
                    bw.write((arr.isEmpty()?-1:arr.remove(arr.size()-1))+"\n");
                    break;
                case "size":
                    bw.write(arr.size()+"\n");
                    break;
                case "empty":
                    bw.write((arr.isEmpty()?1:0)+"\n");
                    break;
                case "top":
                    bw.write((arr.isEmpty()?-1:arr.get(arr.size()-1))+"\n");
                    break;
            }
            N--;
        }
        bw.flush();
        bw.close();
    }
}
