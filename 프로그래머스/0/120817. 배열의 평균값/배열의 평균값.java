import java.util.*;
class Solution {
    public double solution(int[] numbers) {
        
        return (float)Arrays.stream(numbers).sum()/ numbers.length;
    }
}