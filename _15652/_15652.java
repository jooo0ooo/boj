package _15652;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15652 {
	
	public static int n, m;
	public static int[] arr;
	public static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		dfs(1, 1);
		
		bw.flush();
		bw.close();
	}
	
	public static void dfs (int depth, int count) throws IOException {
		if (depth == m + 1) {
			for (int i = 1; i <= m; i++) {
				bw.write(arr[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		for (int i = count; i <= n; i++) {
				arr[depth] = i;
				dfs(depth + 1, i);
		}
		
	}
	
}