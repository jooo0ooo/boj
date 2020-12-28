package _11576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _11576 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(br.readLine());
		
		String data = "";
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < size; i++) {
			String digit = st.nextToken();
			if (digit.length() > 1) {
				digit = (char) (Integer.parseInt(digit) + 87) + "";
			}
			data += digit;
		}
		
		BigInteger decimal = new BigInteger(data, a);
		String result = decimal.toString(b);
		
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) >= 97) {
				bw.write((result.charAt(i) - 87) + "");
			} else {
				bw.write(result.charAt(i) + "");
			}
			if (i + 1 != result.length()) {
				bw.write(" ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}