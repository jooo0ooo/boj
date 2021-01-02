package _16194;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _16194 {

	public static int[] cost, dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		cost = new int[n + 1];
		dp = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < n + 1; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(getMinCost(n) + "");
		bw.flush();
		bw.close();
	}
	
	public static int getMinCost(int n) {
		if (n == 0) {
			return 0;
		}
		
		if (dp[n] != 0) {
			return dp[n];
		}
		
		for (int i = 1; i <= n; i++) {
			if (dp[n] != 0 && dp[n] < cost[i] + getMinCost(n - i)) {
				dp[n] = dp[n];
			} else {
				dp[n] = cost[i] + getMinCost(n - i);
			}
		}
		
		return dp[n];
	}

}