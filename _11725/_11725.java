package _11725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _11725 {

	public static int n;
	public static ArrayList<Integer>[] tree;
	public static boolean[] visited;
	public static int[] parent;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		
		
		visited = new boolean[n+1];
		parent = new int[n+1];
		
		tree = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			tree[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken());
			
			tree[node1].add(node2);
			tree[node2].add(node1);
		}
		
		bfs(1);
		
		for (int i = 2; i <= n; i++) {
			bw.write(parent[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs (int start) {
		visited[start] = true;
		
		for (int i : tree[start]) {
			if (!visited[i]) {
				parent[i] = start;
				dfs(i);
			}
		}
	}
	
	public static void bfs (int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = true;
		
		while (!q.isEmpty()) {
			int current = q.poll();
			
			for (int i : tree[current]) {
				if (!visited[i]) {
					parent[i] = current;
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}

}