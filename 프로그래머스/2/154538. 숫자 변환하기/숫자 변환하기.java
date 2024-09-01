import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> li = new LinkedList<>() {{
            add(new int[]{y,0});
        }};
        Set<Integer> visit = new HashSet<>() {{
            add(y);
        }};
        while (!li.isEmpty()) {
            int[] now = li.poll();
            if (now[0] == x) return now[1]; 
            if (now[0]-n>=x && !visit.contains(now[0]-n)) li.add(new int[]{now[0]-n,now[1]+1});
            if (now[0]%2==0 && now[0]/2>=x && !visit.contains(now[0]/2)) li.add(new int[]{now[0]/2,now[1]+1});
            if (now[0]%3==0 && now[0]/3>=x && !visit.contains(now[0]/3)) li.add(new int[]{now[0]/3,now[1]+1});
        }
        return -1;
    }
}