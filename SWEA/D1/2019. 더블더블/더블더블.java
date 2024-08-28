import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> li = new ArrayList<>();
        li.add(1);
        for (int i=0; i<n; i++) li.add(li.get(li.size()-1)*2);
        System.out.println(li.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}