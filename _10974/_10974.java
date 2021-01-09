package _10974;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10974 {
	
	public static int n;
	public static int[] arr;
	public static boolean[] visited;
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		visited = new boolean[n+1];
		
		dfs(1);
		
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth) throws IOException {
		if (depth == n + 1) {
			for (int i = 1; i <= n; i++) {
				bw.write(arr[i] + " ");
			}
			bw.newLine();
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
		
	}

}