package _10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10807 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //¼±¾ð
		
		int size = Integer.parseInt(br.readLine()); //Int
		int arr[] = new int[size];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < size; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int target = Integer.parseInt(br.readLine()); //Int
		
		int count = 0;
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == target) {
				count++;
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(count + "\n");
		
		bw.flush();
		bw.close();
		
	}

}
