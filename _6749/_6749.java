package _6749;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _6749 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int third = Integer.parseInt(br.readLine()), second = Integer.parseInt(br.readLine());
		
		bw.write(second + second - third + "");
		
		bw.flush();
		bw.close();
		
	}
}