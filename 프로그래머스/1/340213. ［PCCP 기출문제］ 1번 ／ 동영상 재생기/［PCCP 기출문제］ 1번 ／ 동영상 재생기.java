import java.util.Arrays;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int[] now = Arrays.stream(pos.split(":")).mapToInt(i->Integer.parseInt(i)).toArray();
        int now_time = now[0]*60+now[1]; 
        int[] s_op = Arrays.stream(op_start.split(":")).mapToInt(i->Integer.parseInt(i)).toArray();
        int s_time = s_op[0]*60+s_op[1]; 
        int[] e_op = Arrays.stream(op_end.split(":")).mapToInt(i->Integer.parseInt(i)).toArray();
        int e_time = e_op[0]*60+e_op[1]; 
        int[] e_video = Arrays.stream(video_len.split(":")).mapToInt(i->Integer.parseInt(i)).toArray();
        int e_v_time = e_video[0]*60+e_video[1];    
         
        if (s_time<=now_time && now_time<=e_time) {
            now[0] = e_op[0];   
            now[1] = e_op[1];
        }
        
        for (int i=0; i<commands.length; i++) {         
            switch (commands[i]) {
                case "next":
                    now[1]+=10;
                    break;
                case "prev":
                    now[1]-=10;
                    break;
            }
            
            // 시간 변환
            if (now[1]<0) {
                if (now[0] > 0) {
                    now[0]-=1;
                    now[1]+=60;
                } else now[1] = 0;
            } else if (now[1]>59) {
                now[0]+=1;
                now[1]%=60;
            }
            // 오프닝 검토
            now_time = now[0]*60+now[1];
            if (s_time<=now_time && now_time<=e_time) {
                now[0] = e_op[0];
                now[1] = e_op[1];
            } else if (now_time>e_v_time) {
                now[0] = e_video[0];
                now[1] = e_video[1];
            }
            
        }
        
        String h = now[0]>9 ? String.valueOf(now[0]):"0"+String.valueOf(now[0]);
        String m = now[1]>9 ? String.valueOf(now[1]):"0"+String.valueOf(now[1]);
        return String.format("%s:%s",h,m);
    }
}