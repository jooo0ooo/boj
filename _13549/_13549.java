package _13549;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _13549 {

	public static boolean[] visited;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		visited = new boolean[100001];
		
		bw.write(bfs(n, k) + "");
		bw.flush();
		bw.close();
		
	}
	
	public static int bfs(int start, int end) {
		Deque<int[]> q = new LinkedList<>();
		q.add(new int[] {start, 0});
		visited[start] = true;
		
		while (!q.isEmpty()) {
			int[] current = q.poll();
			int index = current[0], cnt = current[1];
			
			if (index == end) {
				return cnt;
			}
			
			if (index * 2 <= 100000 && !visited[index * 2]) {
				visited[index * 2] = true;
				q.push(new int[] {index * 2, cnt});
			}
			
			if (index - 1 >= 0 && !visited[index - 1]) {
				visited[index - 1] = true;
				q.add(new int[] {index - 1, cnt + 1});
			}
			
			if (index + 1 <= 100000 && !visited[index + 1]) {
				visited[index + 1] = true;
				q.add(new int[] {index + 1, cnt + 1});
			}
		}
		
		return -1;
	}
	
}