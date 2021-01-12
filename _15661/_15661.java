package _15661;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _15661 {
	
	public static int n, m, startCount, linkCount, caseCount;
	public static boolean visited[];
	public static int[] arr, start, link;
	public static int[][] data;
	public static boolean isEvenNum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());	
		arr = new int[n+1];
		visited = new boolean[n+1];
		data = new int[n+1][n+1];
		
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				data[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int min = 0;
		for (int i = 1; i <= n / 2; i++) {
			BigInteger caseCountBig = BigInteger.ONE;
			for (int j = n; j > n - i; j--) {
				caseCountBig = caseCountBig.multiply(new BigInteger(j + ""));
			}
			
			for (int j = i; j > 0; j--) {
				caseCountBig = caseCountBig.divide(new BigInteger(j + ""));
			}
			
			isEvenNum = n % 2 == 0 && i == n / 2;
			if (isEvenNum) {
				caseCountBig = caseCountBig.divide(BigInteger.TWO);
			}
			
			caseCount = Integer.parseInt(caseCountBig.toString());
			start = new int[caseCount + 1];
			link = new int[caseCount + 1];
			startCount = 1;
			linkCount = caseCount;
			
			m = i;
			dfs(1, 1, true);
			
			if (!isEvenNum) {
				m = n - i;
				dfs(1, 1, false);
			}
			
			min = Math.abs(start[1] - link[1]);
			for (int j = 2; j <= caseCount; j++) {
				min = Math.min(min, Math.abs(start[j] - link[j]));
			}
			
		}
		
		bw.write(min + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs (int depth, int count, boolean flag) {
		if (depth == m + 1) {
			if (isEvenNum) {
				int sum = 0;
				for (int i = 1; i <= m; i++) {
					for (int j = 1; j <= m; j++) {
						if (i != j) {
							sum += data[arr[i]][arr[j]];
						}
					}
				}
				
				if (startCount <= caseCount) {
					start[startCount] = sum;
					startCount++;
				} else {
					link[linkCount] = sum;
					linkCount--;
				}
				
			} else {
				int sum = 0;
				for (int i = 1; i <= m; i++) {
					for (int j = 1; j <= m; j++) {
						if (i != j) {
							sum += data[arr[i]][arr[j]];
						}
					}
				}
				
				if (flag) {
					start[startCount] = sum;
					startCount++;
				} else {
					link[linkCount] = sum;
					linkCount--;
				}
				
			}
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (!visited[i] && count <= i) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1, i, flag);
				visited[i] = false;
			}
			
		}
		
	}
	
}