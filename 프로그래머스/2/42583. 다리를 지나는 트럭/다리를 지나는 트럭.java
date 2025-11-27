import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int now_weight = 0;
        int now_truck_idx = 0;
        ArrayList<Integer> now_truck = new ArrayList<>();
        ArrayList<Integer> now_bridge_idx = new ArrayList<>();
        while (now_truck_idx!=truck_weights.length) {
            if (now_truck_idx<truck_weights.length && (now_weight+truck_weights[now_truck_idx]<=weight || 
                  (now_bridge_idx.get(0)==0 && now_weight-now_truck.get(0)+truck_weights[now_truck_idx]<=weight))) {
                now_weight+=truck_weights[now_truck_idx];
                now_truck.add(truck_weights[now_truck_idx]);
                now_bridge_idx.add(bridge_length);
                now_truck_idx++;
            }
            
            int delete_idx = -1;
            for (int i=0; i<now_bridge_idx.size(); i++) {
                if (now_bridge_idx.get(i)==0) {
                    delete_idx = i;
                }
                now_bridge_idx.set(i, now_bridge_idx.get(i)-1);
            }
            
            if (delete_idx!=-1) {
                now_weight-= now_truck.get(delete_idx);
                now_truck.remove(delete_idx);
                now_bridge_idx.remove(delete_idx);
            }            
            
            if (!now_bridge_idx.isEmpty()) {
                answer++;
            }
        
        }
        return answer+now_bridge_idx.get(now_bridge_idx.size()-1)+1;
    }
}