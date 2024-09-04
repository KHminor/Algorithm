import java.util.*;

class Solution {
    static List<String> li;
    static String[] words = {"A","E","I","O","U"};
    
    public int solution(String word) {
        li = new ArrayList<>();
        find("",0);
        for (int i=0; i<li.size(); i++) {
            if (word.equals(li.get(i))) return i;
        }
        return 0;
    }
    
    static void find(String str, int len) {
        li.add(str);
        if (len==5) return;
        for (int i=0; i<5; i++) find(str+words[i],len+1);
    }
    
}