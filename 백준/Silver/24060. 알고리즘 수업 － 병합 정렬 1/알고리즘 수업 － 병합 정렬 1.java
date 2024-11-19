import java.io.*;
import java.util.*;

public class Main {
    static int M;
    static int[] li;
    static int[] check;
    static int result = -1;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        li = new int[N];
        check = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            li[i] = Integer.parseInt(st.nextToken());
            check[i]=li[i];
        }
        m_sort(0,N-1);
        System.out.println(result==-1?-1:result);
    }

    public static void m_sort(int s, int e) {
        if (s<e&&result==-1) {
            int mid = (s+e)/2;
            m_sort(s,mid);
            m_sort(mid+1,e);
            merge(s,mid,e);
        }
    }
    public static void merge(int s, int mid, int e) {
        int i = s;
        int j = mid+1;
        int idx =s;
        while (i<=mid && j<=e && result==-1) {
            if (li[i]>=li[j]) {
                check[idx] = li[j];
                j++;
            } else {
                check[idx] = li[i];
                i++;
            }
            cnt++;
            if (cnt==M) {
                result = check[idx];
                break;
            }idx++;
        }
        if (result==-1) {
            int x =0;
            int y =0;
            if (i<=mid) {
                x=i;
                y=mid;
            } else if (j<=e) {
                x=j;
                y=e;
            }
            for (int k=x; k<=y; k++) {
                cnt++;
                check[idx]=li[k];
                if (cnt==M) {
                    result = check[idx];
                    break;
                }idx++;
            }
            for (int a=s; a<=e; a++) li[a]=check[a];
        }
    }
}
