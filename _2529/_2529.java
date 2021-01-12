package _2529;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2529 {

	public static long k, max, min;
	public static int[] arr;
	public static boolean[] visited;
	public static char[] inequality;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		k = Integer.parseInt(br.readLine());
		inequality = br.readLine().replace(" ", "").toCharArray();
		
		arr = new int[10];
		visited = new boolean[10];
		
		max = 0;
		min = 9999999999L;
		dfs(0);
		
		String resultMax = max + "";
		String resultMin = min + "";
		if (resultMax.length() != k+1) {
			resultMax = "0" + resultMax;
		}
		
		if (resultMin.length() != k+1) {
			resultMin = "0" + resultMin;
		}
		
		bw.write(resultMax + "\n" + resultMin);
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int depth) {
		if (depth == k + 1) {
			boolean flag = true;
			String temp = arr[0] + "";
			for (int i = 1; i <= k; i++) {	
				if (inequality[i-1] == '<') {
					flag &= arr[i - 1] < arr[i];
				} else {
					flag &= arr[i - 1] > arr[i];
				}
				temp += arr[i];
			}
			if (flag) {
				max = Math.max(max, Long.parseLong(temp));
				min = Math.min(min, Long.parseLong(temp));
			}
		}
		
		for (int i = 0; i <= 9; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[depth] = i;
				dfs(depth + 1);
				visited[i] = false;
			}
		}
	}

}