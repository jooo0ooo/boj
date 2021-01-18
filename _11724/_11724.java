package _11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11724 {

	public static boolean[] visited;
	public static ArrayList<Integer>[] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		graph = new ArrayList[n+1];
		
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int edge1 = Integer.parseInt(st.nextToken());
			int edge2 = Integer.parseInt(st.nextToken());
			
			graph[edge1].add(edge2);
			graph[edge2].add(edge1);
		}
		
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				dfs(i, 1);
				//bfs(i);
				result++;
			}
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int start, int depth) {
		visited[start] = true;
		
		for (int i : graph[start]) {
			if (!visited[i]) {
				dfs(i, depth+1);
			}
		}
		
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int head = queue.poll();
			for (int i : graph[head]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}

}