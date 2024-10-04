import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i=0; i<arr.length; i++) {
            if (dq.size()==0) dq.add(arr[i]);
            else {
                if (arr[i] > dq.peekLast()) dq.add(arr[i]);
                else {
                    while (dq.size()>0 && dq.peekLast() >= arr[i]) dq.pollLast();
                    dq.add(arr[i]);
                }
            }
        }
        
        int[] stk = dq.stream().mapToInt(Integer::valueOf).toArray();
        return stk;
    }
}