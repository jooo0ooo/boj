package _2750;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2750 {

	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < size; i++) {
			num.add(i, s.nextInt());
		}
		
		Collections.sort(num);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int n : num) {
			bw.write(n + "\n");
		}
		
		bw.close();
		s.close();
	}

}