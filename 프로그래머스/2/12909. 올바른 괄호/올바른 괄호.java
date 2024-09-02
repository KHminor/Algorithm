import java.util.Deque;
import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        Deque<String> stack = new LinkedList<>();
        for (String p: s.split("")) {
            if (p.equals("(")) stack.add(p);
            else {
                if (!stack.isEmpty()) stack.poll();
                else {
                    return false;
                }
            }
        }
        return (stack.isEmpty()) ? true : false;
    }
}