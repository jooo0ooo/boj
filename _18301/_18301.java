package _18301;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _18301 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()),
				n12 = Integer.parseInt(st.nextToken());
		
		bw.write(((n1 + 1) * (n2 + 1) / (n12 + 1)) - 1 + "");
		
		bw.flush();
		bw.close();
		
	}
}