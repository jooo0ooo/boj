package _14928;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _14928 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int remain = 0;
		
		for (int i = 0; i < input.length(); i++) {
			remain = (remain * 10 + input.charAt(i) - '0') % 20000303;
		}
		bw.write(remain + "");
		
		bw.flush();
		bw.close();
		
	}
}