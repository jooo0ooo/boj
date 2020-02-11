package _3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class _3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			arr.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		HashSet<Integer> arrCopy = new HashSet<Integer>(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(arrCopy.size() + "");
		
		bw.flush();
		bw.close();
	}

}