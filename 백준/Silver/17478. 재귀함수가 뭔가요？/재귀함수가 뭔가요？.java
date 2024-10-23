import java.io.*;
import java.util.*;
public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static String act = "____";
    static String ment1 = "\"재귀함수가 뭔가요?\"";
    static String ment2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String ment3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String ment4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String ment5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static String ment6 = "라고 답변하였지.";


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        // 시작
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다."+"\n");
        reg(0);
        bw.flush();

    }

    public static void reg(int now) throws IOException {
        bw.write(act.repeat(now) + ment1 + "\n");
        if (N==now) {
            bw.write(act.repeat(now) + ment5 + "\n");
            bw.write(act.repeat(now) + ment6 + "\n");
            return;
        }
        bw.write(act.repeat(now) + ment2 + "\n");
        bw.write(act.repeat(now) + ment3 + "\n");
        bw.write(act.repeat(now) + ment4 + "\n");
        reg(now+1);
        bw.write(act.repeat(now) + ment6 + "\n");
    }
}
