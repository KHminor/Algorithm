import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> li = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int[] q: queries) Collections.swap(li, q[0], q[1]);
        return li.stream().mapToInt(Integer::valueOf).toArray();
    }
}