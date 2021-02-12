package _1967;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1967 {

	public static int maxW, maxI;
	public static ArrayList<Node>[] tree;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) {
			maxW = 0;
		} else {
			visited = new boolean[n+1];
			
			tree = new ArrayList[n+1];
			for (int i = 1; i <= n; i++) {
				tree[i] = new ArrayList<Node>();
			}
			
			for (int i = 1; i <= n - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int node1 = Integer.parseInt(st.nextToken()), node2 = Integer.parseInt(st.nextToken()), weight = Integer.parseInt(st.nextToken());
				
				tree[node1].add(new Node(node2, weight));
				tree[node2].add(new Node(node1, weight));
			}
			
			dfs (1, 0);
			
			visited = new boolean[n+1];
			dfs (maxI, 0);
		}
		
		bw.write(maxW + "");
		bw.flush();
		bw.close();
		
	}
	
	public static void dfs (int index, int weight) {
		visited[index] = true;
		
		if (maxW < weight) {
			maxW = weight;
			maxI = index;
		}
		
		for (Node node : tree[index]) {
			if (!visited[node.index]) {
				dfs (node.index, weight + node.weight);
			}
		}
		
	}
	
	public static class Node {
		int index, weight;
		
		Node (int index, int weight) {
			this.index = index;
			this.weight = weight;
		}
	}

}