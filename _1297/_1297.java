package _1297;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1297 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), 
				b = Integer.parseInt(st.nextToken()), 
				c = Integer.parseInt(st.nextToken());
		
		double x = Math.sqrt(a * a) / Math.sqrt(b * b + c * c);
		
		bw.write((int)(x * b) + " " + (int)(x * c));
		
		bw.flush();
		bw.close();
		
	}
}