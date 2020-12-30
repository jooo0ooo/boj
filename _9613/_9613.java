package _9613;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _9613 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		long[] sum = new long[t];
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] data = new int[n];
			
			for (int j = 0; j < n; j++) {
				data[j] = Integer.parseInt(st.nextToken());
			}
			
			for (int j = 0; j < n; j++) {
				for (int k = 1; j + k < n; k++) {
					sum[i] += gcd(data[j], data[j + k]);
				}
			}
		}
		
		for (int i = 0; i < t; i++) {
			bw.write(sum[i] + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static int gcd(int a, int b) {
		int big = a > b ? a : b, small = a == big ? b : a;
		int mod = big % small;
		int gcd = small;
		
		while (mod != 0) {
			int temp = gcd % mod;
			gcd = mod;
			mod = temp;
		}
		
		return gcd;
	}

}