package _10819;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10819 {
	
	public static int n, sum;
	public static int[] arr, val;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		val = new int[n+1];
		visited = new boolean[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			val[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(1);
		
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth) {
		if (depth == n + 1) {
			int temp = 0;
			for (int i = 1; i <= n-1; i++) {
				temp += Math.abs(val[arr[i]] - val[arr[i + 1]]);
			}
			sum = Math.max(sum, temp);
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