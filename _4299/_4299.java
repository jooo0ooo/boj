package _4299;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4299 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sum = Integer.parseInt(st.nextToken()), subtract = Integer.parseInt(st.nextToken());
		
		int winner = (sum + subtract) / 2, loser = sum - winner;
		
		if (winner < 0 || loser < 0 || winner < loser || winner + loser != sum || winner - loser != subtract) {
			bw.write("-1");
		} else {
			bw.write(winner + " " + loser);
		}
		
		bw.flush();
		bw.close();
	}

}