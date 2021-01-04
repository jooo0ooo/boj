package _2156;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] cost = new int[n + 1];
		int[] dp = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			cost[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = cost[1];
		if (n > 1) {
			dp[2] = dp[1] + cost[2];
		}
		
		if (n > 2) {
			dp[3] = Math.max(dp[2], Math.max(cost[1] + cost[3], cost[2] + cost[3]));
		}
		
		for (int i = 4; i <= n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + cost[i], dp[i-3] + cost[i-1] + cost[i]));
		}
		
		bw.write(dp[n] + "");
		bw.flush();
		bw.close();
	}
	
}