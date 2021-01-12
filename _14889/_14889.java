package _14889;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _14889 {

	public static int n, m, startCount, linkCount, count;
	public static int[] arr, start, link;
	public static boolean[] visited;
	public static int[][] data;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		m = n / 2;
		arr = new int[n + 1];
		visited = new boolean[n + 1];
		BigInteger countBig = BigInteger.ONE;
		for (int i = n; i > m; i--) {
			countBig = countBig.multiply(new BigInteger(i + ""));
		}
		
		for (int i = m; i > 0; i--) {
			countBig = countBig.divide(new BigInteger(i + ""));
		}
		countBig = countBig.divide(BigInteger.TWO);
		count = Integer.parseInt(countBig.toString());
		start = new int[count + 1];
		link = new int[count + 1];
		startCount = 0;
		linkCount = count;
		
		data = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= n; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(1, 1);
		
		int min = Math.abs(start[1] - link[1]);
		for (int i = 2; i <= count; i++) {
			min = Math.min(min, Math.abs(start[i] - link[i]));
		}
		
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth, int check) {
		if (depth == m + 1) {
			startCount++;
			if (startCount <= count) {
				int sum = 0;
				for (int i = 1; i <= m; i++) {
					for (int j = 1; j <= m; j++) {
						if (i != j) {
							sum += data[arr[i]][arr[j]];
						}
					}
				}
				start[startCount] = sum;
			} else {
				int sum = 0;
				for (int i = 1; i <= m; i++) {
					for (int j = 1; j <= m; j++) {
						if (i != j) {
							sum += data[arr[i]][arr[j]];
						}
					}
				}
				link[linkCount] = sum;
				linkCount--;
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i] && i >= check) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i);
				visited[i] = false;
			}
		}
	}

}