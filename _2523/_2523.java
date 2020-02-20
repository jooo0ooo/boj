package _2523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2523 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		for(int i = size - 1; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
