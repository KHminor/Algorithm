import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        int N = sc.nextInt();
        Deque<List<Integer>> dq = new ArrayDeque<>(Arrays.asList(new ArrayList<>(Arrays.asList(0,N))));
        Set<Integer> s_li = new HashSet<>(Arrays.asList(N));
        List<Integer> result = new ArrayList<>();
        while (!dq.isEmpty()) {
            List<Integer> arr = dq.pollFirst();
            int num = arr.get(arr.size()-1);
            if (num%3==0 && !s_li.contains(num/3)) {
                List<Integer> li = new ArrayList<>(arr);
                li.set(0, li.get(0)+1);
                li.addAll(Arrays.asList(num/3));
                s_li.add(num/3);
                if (num/3==1) {
                    result = li;
                    break;
                } else dq.add(li);
            } if (num%2==0 && !s_li.contains(num/2)) {
                List<Integer> li = new ArrayList<>(arr);
                li.set(0, li.get(0)+1);
                li.addAll(Arrays.asList(num/2));
                s_li.add(num/2);
                if (num/2==1) {
                    result = li;
                    break;
                } else dq.add(li);
            } if (num>1 && !s_li.contains(num-1)) {
                List<Integer> li = new ArrayList<>(arr);
                li.set(0, li.get(0)+1);
                li.addAll(Arrays.asList(num-1));
                s_li.add(num-1);
                if (num-1==1) {
                    result = li;
                    break;
                } else dq.add(li);
            }
        }
        if (!result.isEmpty()) {
            System.out.println(result.get(0));
            for (int i=1; i<result.size(); i++) sb.append(result.get(i)+" ");
            System.out.println(sb.toString());
        } else {
            System.out.println(0);
            System.out.println(1);
        }
    }
}
