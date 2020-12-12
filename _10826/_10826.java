package _10826;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class _10826 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		if (size == 0) {
			bw.write("0");
		} else {
			BigInteger[] fibo = new BigInteger[size + 1];
			fibo[0] = BigInteger.ZERO;
			fibo[1] = BigInteger.ONE;
			
			for (int i = 2; i <= size; i++) {
				fibo[i] = fibo[i-1].add(fibo[i-2]);
			}
			
			bw.write(fibo[size] + "");
		}
		
		
		bw.flush();
		bw.close();
		
	}
}