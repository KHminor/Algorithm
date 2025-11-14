import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String x1 = s1(new_id.toCharArray());
        String x2 = s2(x1.toCharArray());
        String x3 = s3(x2.toCharArray());
        String x4 = s4(x3);
        String x5 = x4.isEmpty()? "a":x4;
        String x6 = s6(x5);
        if (x6.length()<=2) {
            StringBuilder sb = new StringBuilder(x6);
            while (sb.length()!=3) {
                sb.append(x6.charAt(x6.length()-1)); 
            } return sb.toString();
        } return x6;
    }
    
    public String s1(char[] li) {
        StringBuilder sb = new StringBuilder();
        for (char i: li) {
            int idx_i = i;
            if (65<=idx_i && idx_i<=90) {
                sb.append((char) (idx_i+32));
            } else sb.append(i);
        }
        return sb.toString();
    }
    
    public String s2(char[] li) {
        Set<Integer> check = Stream.concat(
            IntStream.rangeClosed(48,57).boxed(),
            IntStream.rangeClosed(97,122).boxed()
        ).collect(Collectors.toSet());
        
        check.add(45);
        check.add(46);
        check.add(95);
        
        StringBuilder sb = new StringBuilder();
        for (char i: li) {
            if (check.contains((int)i)) sb.append(i);
        }
        return sb.toString();
    }
    
    public String s3(char[] li) {
        StringBuilder sb = new StringBuilder();
        char now = '*';
        for (char i: li) {
            if (i!='.') {
                if (now=='.') {
                    sb.append(now);
                }
                sb.append(i);
            }
            now = i;
        }
        if (now=='.') sb.append(now);
        return sb.toString();
    }
    
    public String s4(String x3) {
        int ln = x3.length();
        if (ln==0) return "";
        else if (ln==1) {
            if (x3.charAt(0)=='.') return "";
            else return x3;
        } else {
            int s = 0;
            int e = ln-1;
            if (x3.charAt(0)=='.') s+=1;
            if (x3.charAt(e)=='.') e-=1;
            return x3.substring(s,e+1);
        }
    }
    
    public String s6(String x5) {
        String now = x5;
        if (now.length() >= 16) {           
            if (now.charAt(14)=='.') return now.substring(0,14);
            else return x5.substring(0,15);
        }
        return x5;
    }
}