package _14501;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _14501 {

	public static int n, max;
	public static int[][] data;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		data = new int[2][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[0][i] = Integer.parseInt(st.nextToken());
			data[1][i] = Integer.parseInt(st.nextToken());
		}
		
		max = 0;
		calc(0, 0);
		
		bw.write(max + "");
		bw.flush();
		bw.close();
	}
	
	public static void calc(int index, int sum) {
		if (index >= n) {
			max = Math.max(max, sum);
			return;
		}
		
		if (data[0][index] + index <= n) {
			calc(data[0][index] + index, data[1][index] + sum);
		}
		
		calc (index + 1, sum);
		
	}
}