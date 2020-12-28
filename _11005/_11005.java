package _11005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _11005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		BigInteger n = new BigInteger(st.nextToken());
		String output = n.toString(Integer.parseInt(st.nextToken()));
		
		for (int i = 0; i < output.length(); i++) {
			if (output.charAt(i) >= 97) {
				bw.write((char)(output.charAt(i) - 32) + "");
			} else {
				bw.write(output.charAt(i) + "");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}