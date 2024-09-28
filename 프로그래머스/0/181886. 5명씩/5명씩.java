import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] names) {
        List<String> li = new ArrayList<>();
        int idx = 0;
        for (int i=0; i<names.length; i+=5) li.add(names[i]);
        return li.toArray(new String[0]);
    }
}