package _11050;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11050 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int denominator = 1, numerator = 1;
		
		for(int i = 0; i < k; i++) {
			numerator *= (n - i);
		}
		
		for(int i = 0; i < k; i++) {
			denominator *= (k - i); 
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(numerator / denominator + "");
		
		bw.flush();
		bw.close();
		
	}

}
