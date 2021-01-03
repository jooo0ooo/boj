package _1149;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1149 {

	public static int[][] dp;
	public static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1][3];
		dp = new int[n+1][3];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
		
		for (int j = 1; j <= n; j++) {
			for (int i = 0; i < 3; i++) {
				dp[j][i] = Math.min(dp[j-1][(i+1) % 3] + arr[j][i], dp[j-1][(i+2) % 3] + arr[j][i]);
			}
		}
		
		bw.write(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])) + "");
		bw.flush();
		bw.close();
	}
	
}