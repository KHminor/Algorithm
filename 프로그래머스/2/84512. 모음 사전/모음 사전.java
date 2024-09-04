import java.util.*;
import java.util.stream.Collectors;

class Solution {
    static Deque<String> li;
    static String[] words = {"A","E","I","O","U"};
    static int cnt = 0;
    public int solution(String word) {
        li = new ArrayDeque<>();
        return find(word);
    }
    
    static int find(String word) {
        if ((word.length()==li.size())&&(li.stream().map(String::valueOf).collect(Collectors.joining("")).equals(word))) return cnt;
        else if (li.size()==5) return -1;
        for (String w: words) {
            li.add(w); 
            cnt++;
            int check = find(word);
            if (check != -1) return check;
            li.pollLast();
        }
        return -1;
    }
    
}