package _1676;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class _1676 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger fac = new BigInteger("1");
		
		for(int i = 1; i < n + 1; i++) {
			fac = fac.multiply(new BigInteger(Integer.toString(i)));
		}
		
		String data = fac.toString();
		int result = 0;
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		for(int i = data.length() - 1; i >= 0; i--) {
			if(data.charAt(i) == 48) {
				result++;
			} else {
				break;
			}
			
		}
		
		bw.write(result + "");
		
		bw.flush();
		bw.close();
		
	}

}
