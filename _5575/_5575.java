package _5575;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _5575 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer stA = new StringTokenizer(br.readLine());
		int startAH = Integer.parseInt(stA.nextToken()), startAM = Integer.parseInt(stA.nextToken()),
				startAS = Integer.parseInt(stA.nextToken()), endAH = Integer.parseInt(stA.nextToken()),
				endAM = Integer.parseInt(stA.nextToken()), endAS = Integer.parseInt(stA.nextToken());
		
		StringTokenizer stB = new StringTokenizer(br.readLine());
		int startBH = Integer.parseInt(stB.nextToken()), startBM = Integer.parseInt(stB.nextToken()),
				startBS = Integer.parseInt(stB.nextToken()), endBH = Integer.parseInt(stB.nextToken()),
				endBM = Integer.parseInt(stB.nextToken()), endBS = Integer.parseInt(stB.nextToken());
		
		StringTokenizer stC = new StringTokenizer(br.readLine());
		int startCH = Integer.parseInt(stC.nextToken()), startCM = Integer.parseInt(stC.nextToken()),
				startCS = Integer.parseInt(stC.nextToken()), endCH = Integer.parseInt(stC.nextToken()),
				endCM = Integer.parseInt(stC.nextToken()), endCS = Integer.parseInt(stC.nextToken());
		
		int aWork = (endAH * 3600 + endAM * 60 + endAS) - (startAH * 3600 + startAM * 60 + startAS);
		int bWork = (endBH * 3600 + endBM * 60 + endBS) - (startBH * 3600 + startBM * 60 + startBS);
		int cWork = (endCH * 3600 + endCM * 60 + endCS) - (startCH * 3600 + startCM * 60 + startCS);
		
		bw.write(aWork / 3600 + " " + (aWork % 3600) / 60 + " " + (aWork % 3600) % 60);
		bw.newLine();
		bw.write(bWork / 3600 + " " + (bWork % 3600) / 60 + " " + (bWork % 3600) % 60);
		bw.newLine();
		bw.write(cWork / 3600 + " " + (cWork % 3600) / 60 + " " + (cWork % 3600) % 60);
		
		bw.flush();
		bw.close();
	}

}