class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int mx_health = health;
        int a_idx = 0;
        int b_cnt = 0;
        for (int i=1; i<=attacks[attacks.length-1][0]; i++) {
            if (attacks[a_idx][0]==i) {
                // 체력 회복부터
                health += bandage[1]*b_cnt+b_cnt/bandage[0]*bandage[2];
                if (health>mx_health) health=mx_health;
                
                health-=attacks[a_idx][1];
                a_idx++;
                b_cnt = 0;
                if (health<=0) return -1;
            } else b_cnt++;
        }
        
        return health;
    }
}