package _5532;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _5532 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int l = Integer.parseInt(br.readLine()), a = Integer.parseInt(br.readLine()),
				b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine()),
				d = Integer.parseInt(br.readLine());
		
		bw.write(l - Math.max(a % c == 0 ? a / c : a / c + 1, b % d == 0 ? b / d : b / d + 1) + "");
		
		bw.flush();
		bw.close();
	}

}