import java.util.*;
import java.io.*;

class Bus implements Comparable<Bus>{
	int arrive, weight;
	
	Bus(int arrive, int weight) {
		this.arrive = arrive;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Bus b) {
		return weight - b.weight;
	}
}

public class Main {
	
	static int N, M;
	static ArrayList<Bus>[] busMap;
	static boolean visited[];
	static int[] dist;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine()); //도시의 개수
		M = Integer.parseInt(br.readLine()); //버스의 개수
		
		busMap = new ArrayList[N+1];
		visited = new boolean[N+1];
		dist = new int[N+1]; //각 지점에 가기까지의 최소거리를 차곡차곡 담아줄거
		Arrays.fill(dist, Integer.MAX_VALUE); //최소 거리 구해주고, 값 비교해줘야해서 아주 제일 큰값 넣어줌
		
		for(int i=1;i<=N;i++) {
			busMap[i] = new ArrayList<>();
		}
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			busMap[start].add(new Bus(end, w));
		}
		
		st = new StringTokenizer(br.readLine());
		
		int startCity = Integer.parseInt(st.nextToken());
		int endCity = Integer.parseInt(st.nextToken());
		
		dijkstra(startCity);
		
		bw.write(dist[endCity]+"");
		bw.flush();
		bw.close();
		
	}
	
	public static void dijkstra(int startCity) {
		PriorityQueue<Bus> que = new PriorityQueue<>();
		que.offer(new Bus(startCity, 0));
		dist[startCity] = 0; //시작지점이니까 0으로 초기화해줌.
		
		while(!que.isEmpty()) {
			Bus currBus = que.poll();
			int currEnd = currBus.arrive; //지금 있는 노드의 도착지점을 담아둔다.
			
			if(!visited[currEnd]) { //방문하지 않았다면, 방문처리해두고 for문 들어감 아님 패스
				visited[currEnd] = true;
				
				for(Bus b : busMap[currEnd]) { //다음노드에 담겨있는 버스 정보들을 전부 훑어본다.
					if(!visited[b.arrive] && dist[b.arrive]>dist[currEnd]+b.weight) { //지나가지 않았고, 
						dist[b.arrive] = dist[currEnd]+b.weight;
						que.offer(new Bus(b.arrive, dist[b.arrive])); //우선순위 큐로서, weight가 작은것부터
					}
				}
			}
		}	
	}
}