package _16940;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _16940 {
	
	public static ArrayList<Integer>[] graph;
	public static int[] arr;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		for (int i = 1; i <= n - 1; i++) {
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
		
		bw.write(bfs() + "");
		bw.flush();
		bw.close();
		
	}
	
	public static int bfs() {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1] = true;
		
		int index = 1;
		HashSet<Integer> set = new HashSet<>();
		
		while(!q.isEmpty()) {
			set.clear();
			int current = q.poll();
			
			for (int next : graph[current]) {
				if (!visited[next]) {
					visited[next] = true;
					set.add(next);
				}
			}
			
			int size = set.size();
			for (int i = index + 1; i <= index + size; i++) {
				if (set.contains(arr[i])) {
					q.add(arr[i]);
				} else {
					return 0;
				}
			}
			index += size;
				
		}
		return 1;
	}

}