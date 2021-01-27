package _16947;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class _16947 {
	
	public static int n, start;
	public static ArrayList<Integer>[] station;
	public static Set<Integer> circle;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		circle = new HashSet<Integer>();
		
		station = new ArrayList[n+1];
		for (int i = 1; i <= n; i++) {
			station[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int edge1 = Integer.parseInt(st.nextToken()), edge2 = Integer.parseInt(st.nextToken());
			
			station[edge1].add(edge2);
			station[edge2].add(edge1);
		}
		
		for (int i = 1; i <= n; i++) {
			if (!circle.contains(i)) {
				visited = new boolean[n+1];
				start = i;
				dfsForFindCircle(i, 1);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			visited = new boolean[n+1];
			bw.write(bfsForDistanceToCircle(i) + " ");
		}
		bw.flush();
		bw.close();
	}
	
	public static void dfsForFindCircle(int node, int count) {
		visited[node] = true;
		
		for (int next : station[node]) {
			if (count >= 3 && next == start) {
				for (int i = 1; i <= n; i++) {
					if (visited[i]) {
						circle.add(i);
					}
				}
			}
			
			if (!visited[next]) {
				dfsForFindCircle(next, count+1);
				visited[next] = false;
			}
		}
		
	}
	
	public static int bfsForDistanceToCircle(int node) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {node, 0});
		visited[node] = true;
		
		while(!q.isEmpty()) {
			int[] current = q.poll();
			
			if (circle.contains(current[0])) {
				return current[1];
			}
			
			for (int next : station[current[0]]) {
				if (!visited[next]) {
					visited[next] = true;
					q.add(new int[] {next, current[1] + 1});
				}
			}
		}
		
		return 0;
	}

}