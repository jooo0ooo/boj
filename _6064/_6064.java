package _6064;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _6064 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		loop:
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), 
					x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			int tempY = x;
			int result = x;
			
			for (int j = 0; j < n; j++) {
				tempY = tempY % n;
				if (tempY == 0) {
					tempY = n;
				}
				
				if (tempY == y) {
					bw.write(result + "\n");
					continue loop;
				}
				
				result += m;
				tempY += m;
			}
			
			bw.write("-1\n");
			
		}
		
		bw.flush();
		bw.close();	
	}
}