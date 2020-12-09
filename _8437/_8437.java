package _8437;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class _8437 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BigInteger total = new BigInteger(br.readLine()), diff = new BigInteger(br.readLine());
		BigInteger common = total.subtract(diff).divide(BigInteger.TWO);
		
		bw.write(common.add(diff) + "\n" + common);
		
		bw.flush();
		bw.close();
		
	}
}