package _1629;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1629 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
				c = Integer.parseInt(st.nextToken());
		
		bw.write(modInPow(a, b, c) + "");
		
		bw.flush();
		bw.close();
		
	}
	
	static long modInPow(int a, int b, int c) {
		if (b == 0) {
			return 1;
		}
		
		long n = modInPow(a, b / 2, c);
		long temp = n * n % c;
		
		if (b % 2 == 0) {
			return temp;
		} else {
			return a * temp % c;
		}
	}
	
}