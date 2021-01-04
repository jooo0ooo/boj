package _9465;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _9465 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int[][] cost, dp;
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			cost = new int[n+1][2];
			dp = new int[n+1][2];
			
			for (int j = 0; j < 2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int k = 1; k <= n; k++) {
					cost[k][j] = Integer.parseInt(st.nextToken());
				}	
			}
			dp[1][0] = cost[1][0];
			dp[1][1] = cost[1][1];
			
			for (int j = 2; j <= n; j++) {
				dp[j][0] = Math.max(dp[j-1][1], dp[j-2][1]) + cost[j][0];
				dp[j][1] = Math.max(dp[j-1][0], dp[j-2][0]) + cost[j][1];
			}
			
			bw.write(Math.max(dp[n][0], dp[n][1]) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}