package _13023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _13023 {

	public static int result;
	public static boolean[] visited;
	public static ArrayList<Integer>[] list;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		result = 0;
		visited = new boolean[n];
		list = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int edge1 = Integer.parseInt(st.nextToken());
			int edge2 = Integer.parseInt(st.nextToken());
			
			list[edge1].add(edge2);
			list[edge2].add(edge1);
		}
		
		for (int i = 0; i < n; i++) {
			dfs(i, 0);
		}
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int start, int depth) {
		if (depth == 4 || result == 1) {
			result = 1;
			return;
		}
		
		visited[start] = true;
		for (int i : list[start]) {
			if (!visited[i]) {
				dfs(i, depth+1);
			}
		}
		visited[start] = false;
	}

}