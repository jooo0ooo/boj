package _2609;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2609 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int big = (a >= b) ? a : b, small = (big == a) ? b : a;
		
		int gcd = small;
		int mod = big % small;
		
		while (mod != 0) {
			int temp = gcd % mod;
			gcd = mod;
			mod = temp;
		}
		
		bw.write(gcd + "\n" + a * b / gcd);
		bw.flush();
		bw.close();
		
	}
}