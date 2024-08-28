import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> li = new HashSet<>();
        for (int i=1; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                li.add(i);
                li.add(n/i);
            }
        }
        List<Integer> result = new ArrayList<>(li);
        Collections.sort(result);
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}