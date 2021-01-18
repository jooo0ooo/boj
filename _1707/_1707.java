package _1707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1707 {

	public static ArrayList<Integer>[] graph;
	public static int[] colors;
	public static boolean isBipartite;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
			
			colors = new int[v+1];
			isBipartite = true;
			
			graph = new ArrayList[v+1];
			for (int j = 1; j <= v; j++) {
				graph[j] = new ArrayList<Integer>();
			}
			
			for (int j = 1; j <= e; j++) {
				st = new StringTokenizer(br.readLine());
				int edge1 = Integer.parseInt(st.nextToken());
				int edge2 = Integer.parseInt(st.nextToken());
				
				graph[edge1].add(edge2);
				graph[edge2].add(edge1);
			}
			
			for (int j = 1; j <= v; j++) {
				if (colors[j] == 0) {
					//dfs(j, 1);
					bfs(j, 1);
				}
			}
			
			bw.write(isBipartite ? "YES" : "NO");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs(int start, int color) {
		colors[start] = color;
		
		for (int i : graph[start]) {
			
			if (colors[i] == color) {
				isBipartite = false;
				return;
			}
			
			if (colors[i] == 0) {
				dfs(i, -color);
			}
		}
	}
	
	public static void bfs(int start, int color) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		colors[start] = color;
		
		while(!queue.isEmpty()) {
			int head = queue.poll();
			
			for (int i : graph[head]) {
				if (colors[i] == 0) {
					queue.add(i);
					colors[i] = colors[head] * -1;
				} else if (colors[i] + colors[head] != 0) {
					isBipartite = false;
					return;
				}
			}
			
		}
		
	}

}
