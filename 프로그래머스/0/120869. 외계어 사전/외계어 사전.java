import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<Integer> check = new ArrayList<>(Collections.nCopies(spell.length, 0)); // 체크 배열
        for (String d: dic) {
            
            List<Integer> li = new ArrayList<>(Collections.nCopies(spell.length, 1)); // 카운팅 배열
            char[] ch_li = d.toCharArray(); // 문자 배열
            
            for (int i=0; i < ch_li.length; i++) {
                for (int j=0; j<spell.length; j++) {
                    if (ch_li[i] == spell[j].charAt(0)) li.set(j,li.get(j)-1);
                }
            }
            if (Arrays.equals(check.toArray(), li.toArray())) return 1;
        }
        return 2;
    }
}