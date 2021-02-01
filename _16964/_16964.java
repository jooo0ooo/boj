package _16964;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _16964 {
	
	public static int n, depth;
	public static ArrayList<Integer>[] graph;
	public static int[] arr;
	public static boolean[] visited;
	public static boolean flag;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken());
			
			graph[node1].add(node2);
			graph[node2].add(node1);
		}
		
		visited = new boolean[n+1];
		arr = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		flag = true;
		depth = 2;
		dfs(1);
		
		bw.write(flag ? "1" : "0");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int current) {
		
		if (visited[current]) {
			return;
		}
		
		visited[current] = true;
		
		HashSet<Integer> set = new HashSet<>();
		for (int next : graph[current]) {
			if (!visited[next]) {
				set.add(next);
			}
		}
		
		if (set.size() == 0) {
			return;
		}
		
		if (set.contains(arr[depth])) {
			dfs(arr[depth++]);
		} else {
			flag = false;
		}
		
	}
	
}