package _1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1978 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < size; i++) {
			int data = Integer.parseInt(st.nextToken());
			
			if (data == 1) {
				continue;
			}
			
			if (data <= 3) {
				count++;
				continue;
			}

			int index = 2;
			boolean flag = false;
			
			while (index < data && !flag) {
				int gcd = index;
				int mod = data % gcd;
				while (mod != 0) {
					int temp = gcd % mod;
					gcd = mod;
					mod = temp;
				}
				
				if (mod == 0 && gcd > 1) {
					flag = true;
				} else {
					index++;
				}
			}
			
			if (!flag) {
				count++;
			}
			
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
		
	}
}