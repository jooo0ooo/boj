package _17256;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _17256 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer cakeA = new StringTokenizer(br.readLine());
		int ax = Integer.parseInt(cakeA.nextToken()), ay = Integer.parseInt(cakeA.nextToken()), 
				az = Integer.parseInt(cakeA.nextToken());
		
		StringTokenizer cakeC = new StringTokenizer(br.readLine());
		int cx = Integer.parseInt(cakeC.nextToken()), cy = Integer.parseInt(cakeC.nextToken()), 
				cz = Integer.parseInt(cakeC.nextToken());
		
		bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax));
		
		bw.flush();
		bw.close();
		
	}
}