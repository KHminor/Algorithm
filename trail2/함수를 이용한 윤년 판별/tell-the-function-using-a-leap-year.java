import java.io.*;


public class Main {
    public static boolean step1(int n) {
        return n%4==0?true:false;
    }

    public static boolean step2(int n) {
        return n%100==0 && n%400!=0?false:true;
    }


    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());

        if (step1(y)&&step2(y)) System.out.println("true");
        else System.out.println("false");
    }
}