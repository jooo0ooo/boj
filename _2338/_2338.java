package _2338;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class _2338 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger first = new BigInteger(br.readLine()), 
				second = new BigInteger(br.readLine());
		
		bw.write(first.add(second) + "\n" + first.subtract(second) + "\n" + first.multiply(second));
		
		bw.flush();
		bw.close();
		
	}
}