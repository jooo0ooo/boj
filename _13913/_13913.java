package _13913;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _13913 {

	public static int[] graph;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		graph = new int[100001];
		if (n == k) {
			bw.write("0\n" + n);
		} else {
			bfs(n);
			
			int[] arr = new int[graph[k] + 1];
			for (int i = graph[k]; i >= 0; i--) {
				if (i == graph[k]) {
					arr[i] = k;
				} else if (i == 0) {
					arr[i] = n;
				} else {
					if (arr[i+1] + 1 <= 100000 && graph[arr[i+1] + 1] == i) {
						arr[i] = arr[i+1] + 1;
						continue;
					}
					
					if (arr[i+1] - 1 >= 0 && graph[arr[i+1] - 1] == i) {
						arr[i] = arr[i+1] - 1;
						continue;
					}
					
					if (arr[i+1] % 2 == 0 && graph[arr[i+1] / 2] == i) {
						arr[i] = arr[i+1] / 2;
						continue;
					}
				}
			}
			
			bw.write(graph[k] + "\n");
			for (int i = 0; i <= graph[k]; i++) {
				bw.write(arr[i] + " ");
			}
		}
		
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