package _1748;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		int nLen = n.length();
		int result = 0;
		
		for (int i = 1; i < nLen; i++) {
			result += Math.pow(10, i-1) * 9 * i;
		}
		
		result += ((Integer.parseInt(n) - Math.pow(10, nLen-1)) + 1) * nLen;
		
		bw.write(result + "");
		bw.flush();
		bw.close();
	}
}
