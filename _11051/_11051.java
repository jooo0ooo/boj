package _11051;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _11051 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		BigInteger denominator2 = new BigInteger("1"), numerator2 = new BigInteger("1");
		
		for(int i = 0; i < k; i++) {
			numerator2 = numerator2.multiply(new BigInteger(Integer.toString(n - i)));
		}
		
		for(int i = 0; i < k; i++) {
			denominator2 = denominator2.multiply(new BigInteger(Integer.toString(k - i)));
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(numerator2.divide(denominator2).remainder(new BigInteger("10007")) + "");
		
		bw.flush();
		bw.close();
		
	}

}
