import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> li = new ArrayList<>();
        for (int i=0; i<num_list.length; i+=n) li.add(num_list[i]);
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}