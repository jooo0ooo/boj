package _1248;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1248 {

	public static int[] arr;
	public static char[][] input;
	public static int n;
	public static BufferedWriter bw;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		input = new char[n+1][n+1];
		String temp = br.readLine();
		int tempCount = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				input[i][j] = temp.charAt(tempCount);				
				tempCount++;
			}
		}
		
		arr = new int[n + 1];
		dfs(1);
	}
	
	public static void dfs(int depth) throws IOException {
		if (depth == n + 1) {
			for (int i = 1; i <= n; i++) {
				bw.write(arr[i] + " ");
			}
			bw.flush();
			bw.close();
			System.exit(0);
		}
		
		for (int i = -10; i <= 10; i++) {
			arr[depth] = i;
			if (check(depth)) {
				dfs(depth + 1);
			}
		}
		
	}
	
	public static boolean check(int idx) {
		for (int i = 1; i <= idx; i++) {
			int sum = 0;
			for (int j = i; j <= idx; j++) {
				sum += arr[j];
				if (input[i][j] != (sum == 0 ? '0' : (sum > 0 ? '+' : '-'))) {
					return false;
				}
			}
		}
		return true;
	}
}