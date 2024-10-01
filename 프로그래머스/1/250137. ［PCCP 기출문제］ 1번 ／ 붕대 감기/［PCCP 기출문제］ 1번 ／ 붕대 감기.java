class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int now_health = health;
        int now = 1;
        
//         for (int i=1; i<=attacks[attacks.length-1][0]; i++) {
//             if (attacks[a_idx][0]==i) {
//                 // 체력 회복부터
//                 health += bandage[1]*b_cnt+b_cnt/bandage[0]*bandage[2];
//                 if (health>mx_health) health=mx_health;
                
//                 health-=attacks[a_idx][1];
//                 a_idx++;
//                 b_cnt = 0;
//                 if (health<=0) return -1;
//             } else b_cnt++;
//         }
        for (int[] atk: attacks) {
            int diff = atk[0]-now;
            now_health += diff*bandage[1]+diff/bandage[0]*bandage[2];
            if (now_health>health) now_health = health;
            now_health -= atk[1];
            if (now_health<=0) return -1;
            now = atk[0]+1;
        }
        
        
        return now_health;
    }
}