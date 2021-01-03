package _2225;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2225 {

	public static int[][] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		dp = new int[n + 1][k + 1];
		
		for (int i = 0; i <= n; i++) {
			dp[i][1] = 1;
		}
		
		bw.write(getNum(n, k) + "");
		bw.flush();
		bw.close();
		
	}

	public static int getNum(int n, int k) {
		if (k == 0) {
			return 0;
		}
		
		if (n == 0) {
			return 1;
		}
		
		if (dp[n][k] != 0) {
			return dp[n][k];
		}
		
		for (int i = 0; i <= n && k > 1; i++) {
			dp[n][k] = (dp[n][k] + getNum(i, k-1)) % 1000000000;
		}
		
		return dp[n][k];
	}
	
}
