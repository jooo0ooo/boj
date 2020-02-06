package _11656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _11656 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int arrSize = s.length();
		List<String> arr = new ArrayList<>();
		
		for(int i = 0; i < arrSize; i++) {
			arr.add(s.substring(i, arrSize));
		}
		
		Collections.sort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < arrSize; i++) {
			bw.write(arr.get(i) + "\n");
		}
				
		bw.flush();
		bw.close();
		
	}

}