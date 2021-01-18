package _1260;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260 {
	
	public static ArrayList<Integer>[] data;
	public static boolean[] visited;
	public static BufferedWriter bw;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		data = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
			data[i] = new ArrayList<Integer>();
		}
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int edge1 = Integer.parseInt(st.nextToken());
			int edge2 = Integer.parseInt(st.nextToken());
			
			data[edge1].add(edge2);
			data[edge2].add(edge1);
		}
		
		for (int i = 1; i <= n; i++) {
			Collections.sort(data[i]);
		}
		
		dfs(v, 0);
		
		bw.newLine();
		
		visited = new boolean[n+1];
		bfs(v);
		
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int start, int depth) throws IOException {
		bw.write(start + " ");
		
		visited[start] = true;
		for (int i : data[start]) {
			if (!visited[i]) {
				dfs(i, depth+1);
			}
		}
	}
	
	public static void bfs(int start) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int head = queue.poll();
			
			bw.write(head + " ");
			
			for (int i : data[head]) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		
	}
	
}