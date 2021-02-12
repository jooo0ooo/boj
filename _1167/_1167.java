package _1167;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1167 {

	public static int maxW, maxI;
	public static ArrayList<Node>[] tree;
	public static boolean[] visited;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int v = Integer.parseInt(br.readLine());
		
		tree = new ArrayList[v+1];
		for (int i = 1; i <= v; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for (int i = 1; i <= v; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node1 = Integer.parseInt(st.nextToken());
			
			while (true) {
				int node2 = Integer.parseInt(st.nextToken());
				if (node2 == -1) {
					break;
				}
				
				int weight = Integer.parseInt(st.nextToken());
				
				tree[node1].add(new Node(node2, weight));
			}	
		}
		
		visited = new boolean[v+1];
		dfs(1, 0);
		
		visited = new boolean[v+1];
		dfs(maxI, 0);
		
		bw.write(maxW + "");
		bw.flush();
		bw.close();
	}
	
	public static void dfs (int index, int weight) {
		visited[index] = true;
		
		if (weight > maxW) {
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