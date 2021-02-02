package _1697;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697 {

	public static int[] graph;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		graph = new int[100001];
		
		bfs(n);
		
		bw.write((n == k ? 0 : graph[k]) + "");
		bw.flush();
		bw.close();
		
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);

		while (!q.isEmpty()) {
			int current = q.poll();
			int[] next = {current - 1, current + 1, current * 2};
			
			for (int i = 0; i < 3; i++) {
				
				if (next[i] >= 0 && next[i] <= 100000 && graph[next[i]] == 0) {
					q.add(next[i]);
					graph[next[i]] = graph[current] + 1;					
				}
			}
		}
		
	}
}