package _1991;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1991 {

	public static int[][] tree;
	public static BufferedWriter bw;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		tree = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			char[] temp = br.readLine().toCharArray();
			tree[temp[0] - 65][0] = (temp[2] >= 65 && temp[2] <= 90) ? temp[2] - 65 : -1;
			tree[temp[0] - 65][1] = (temp[4] >= 65 && temp[4] <= 90) ? temp[4] - 65 : -1;
		}
		
		preorder(0);
		bw.newLine();
		
		inorder(0);
		bw.newLine();
		
		postorder(0);
		
		bw.flush();
		bw.close();
		
	}
	
	public static void preorder(int node) throws IOException {
		bw.write(node + 65);
		
		if (tree[node][0] != -1) {
			preorder(tree[node][0]);
		}
		
		if (tree[node][1] != -1) {
			preorder(tree[node][1]);
		}
	}
	
	public static void inorder(int node) throws IOException {
		if (tree[node][0] == -1 && tree[node][1] == -1) {
			bw.write(node + 65);
		} else {
			if (tree[node][0] != -1) {
				inorder(tree[node][0]);
			}
			
			bw.write(node + 65);
			
			if (tree[node][1] != -1) {
				inorder(tree[node][1]);
			}
		}
	}
	
	public static void postorder(int node) throws IOException {
		if (tree[node][0] == -1 && tree[node][1] == -1) {
			bw.write(node + 65);
		} else {
			if (tree[node][0] != -1) {
				postorder(tree[node][0]);
			}
			
			if (tree[node][1] != -1) {
				postorder(tree[node][1]);
			}
			
			bw.write(node + 65);
		}
	}
}