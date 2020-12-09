package _20254;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _20254 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ur = Integer.parseInt(st.nextToken()), tr = Integer.parseInt(st.nextToken()),
				uo = Integer.parseInt(st.nextToken()), to = Integer.parseInt(st.nextToken());
		
		bw.write(56 * ur + 24 * tr + 14 * uo + 6 * to + "");
		
		bw.flush();
		bw.close();
		
	}
}