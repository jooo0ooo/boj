package _5596;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5596 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stMin = new StringTokenizer(br.readLine());
		int minTotal = Integer.parseInt(stMin.nextToken()) + Integer.parseInt(stMin.nextToken())
			+ Integer.parseInt(stMin.nextToken()) + Integer.parseInt(stMin.nextToken());
		
		StringTokenizer stMan = new StringTokenizer(br.readLine());
		int manTotal = Integer.parseInt(stMan.nextToken()) + Integer.parseInt(stMan.nextToken())
		+ Integer.parseInt(stMan.nextToken()) + Integer.parseInt(stMan.nextToken());
		
		bw.write(Math.max(minTotal, manTotal) + "");
		
		bw.flush();
		bw.close();
	}

}
