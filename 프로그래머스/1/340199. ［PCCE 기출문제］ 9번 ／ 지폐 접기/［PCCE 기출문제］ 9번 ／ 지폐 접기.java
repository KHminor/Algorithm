import java.util.Arrays;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet); 
        
        while (true) {
            if (bill[0]>bill[1]) Arrays.sort(bill);
            if (!(wallet[1]>=bill[1]) || !(wallet[0]>=bill[0])) bill[1]/=2;
            else break;
            answer++;
        }
        return answer;
    }
}