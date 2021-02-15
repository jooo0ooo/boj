package _10825;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _10825 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[][] data = new String[n][4];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = st.nextToken();
			data[i][1] = st.nextToken();
			data[i][2] = st.nextToken();
			data[i][3] = st.nextToken();
		}
		
		Arrays.sort(data, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int compare1 = Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
				if (compare1 > 0) {
					return -1;
				} else if (compare1 == 0) {
					int compare2 = Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
					if (compare2 < 0) {
						return -1;
					} else if (compare2 == 0) {
						int compare3 = Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
						if (compare3 > 0) {
							return -1;
						} else if (compare3 == 0) {
							return o1[0].compareTo(o2[0]);
						}
					}
				}
				return 1;
			}
		});
		
		for (int i = 0; i < n; i++) {
			bw.write(data[i][0] + "\n");
		}
		bw.flush();
		bw.close();
	}

}