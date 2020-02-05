package _11655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _11655 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		char sArr[] = s.toCharArray();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i] <= 90 && sArr[i] >= 65) {
				int data = (sArr[i] + 13) % 91;
				if(data < 13) {
					data = data + 65;
				}
				bw.write((char) data);
			} else if(sArr[i] <= 122 && sArr[i] >= 97) {
				int data = (sArr[i] + 13) % 123;
				if(data < 13) {
					data = data + 97;
				}
				bw.write((char) data);
			} else {
				bw.write(sArr[i]);
			}
		}
		
		bw.flush();
		bw.close();
		
		char a = 'a'; //97
		char b = 'z'; //122
		char c = 'A'; //65
		char d = 'Z'; //90
		
	}

}