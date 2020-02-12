package _1427;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class _1427 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String data = br.readLine();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < data.length(); i++) {
			arr.add((int) data.charAt(i) - 48);
		}
		
		Collections.sort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = arr.size() - 1; i >= 0; i--) {
			bw.write(arr.get(i) + "");
		}
		
		bw.flush();
		bw.close();
	
	}
	
}