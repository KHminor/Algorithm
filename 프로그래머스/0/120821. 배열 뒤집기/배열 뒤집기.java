import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {    
        int[] result = new int[num_list.length];
        Arrays.setAll(result,i -> num_list[num_list.length-1-i]);
        return result;
    }
}