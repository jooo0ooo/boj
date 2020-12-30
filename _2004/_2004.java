package _2004;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2004 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int count2 = numCount(n, 2) - numCount(m, 2) - numCount(n-m, 2);
		int count5 = numCount(n, 5) - numCount(m, 5) - numCount(n-m, 5);
		
		bw.write(Math.min(count2, count5) + "");
		
		bw.flush();
		bw.close();
		
	}
	
	public static int numCount(int n, int c) {
		int count = 0;
		
		for (long i = c; i <= n; i *= c) {
			count += n / i;
		}
		return count;
	}
}