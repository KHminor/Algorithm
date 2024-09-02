import java.util.Arrays;
class Solution {
    public String solution(String s) {
        int[] li = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(li);
        return String.format("%d %d",li[0],li[li.length-1]);
    }
}