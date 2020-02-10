package _12813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _12813 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a2 = br.readLine();
		String b2 = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//A & B
		for(int i = 0; i < a2.length(); i++) {
			
			if(a2.charAt(i) + b2.charAt(i) == 96) {
				bw.write("0");
			} else if(a2.charAt(i) + b2.charAt(i) == 97) {
				bw.write("0");
			} else {
				bw.write("1");
			}
		}
		bw.write("\n");
		
		//A | B
		for(int i = 0; i < a2.length(); i++) {
			
			if(a2.charAt(i) + b2.charAt(i) == 96) {
				bw.write("0");
			} else if(a2.charAt(i) + b2.charAt(i) == 97) {
				bw.write("1");
			} else {
				bw.write("1");
			}
		}
		bw.write("\n");
		
		//A ^ B
		for(int i = 0; i < a2.length(); i++) {
			
			if(a2.charAt(i) + b2.charAt(i) == 96) {
				bw.write("0");
			} else if(a2.charAt(i) + b2.charAt(i) == 97) {
				bw.write("1");
			} else {
				bw.write("0");
			}
		}
		bw.write("\n");
		
		//~A
		for(int i = 0; i < a2.length(); i++) {
			
			if(a2.charAt(i) == 48) {
				bw.write("1");
			} else if(a2.charAt(i) == 49) {
				bw.write("0");
			}
		}
		bw.write("\n");
		
		//~B
		for(int i = 0; i < a2.length(); i++) {
			
			if(b2.charAt(i) == 48) {
				bw.write("1");
			} else if(b2.charAt(i) == 49) {
				bw.write("0");
			}
		}
		bw.write("\n");
		
		bw.flush();
		bw.close();
		
	}

}