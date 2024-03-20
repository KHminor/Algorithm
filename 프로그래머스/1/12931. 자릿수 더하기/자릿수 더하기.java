import java.util.*;

public class Solution {
    public int solution(int n) {
        int result = 0;
        String s_n = String.valueOf(n);
        for (char num: s_n.toCharArray()) result += Integer.parseInt(String.valueOf(num));
        return result;
    }
}