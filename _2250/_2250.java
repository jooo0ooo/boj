package _2250;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _2250 {
	
	public static Node[] tree;
	public static int[] minLevel, maxLevel;
	public static int levelMax, cordinate;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		minLevel = new int[n+1];
		maxLevel = new int[n+1];
		
		tree = new Node[n+1];
		for (int i = 1; i <= n; i++) {
			tree[i] = new Node(-1, -1);
			minLevel[i] = n;
			maxLevel[i] = 0;
		}
		
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken()), left = Integer.parseInt(st.nextToken()), right = Integer.parseInt(st.nextToken());
			
			tree[idx].left = left;
			tree[idx].right = right;
			
			if (left != -1) {
				tree[left].parent = idx;
			}
			
			if (right != -1) {
				tree[right].parent = idx;
			}
		}
		
		int root = 0;
		for (int i = 1; i <= n; i++) {
			if (tree[i].parent == -1) {
				root = i;
				break;
			}
		}
		
		levelMax = 0;
		cordinate = 1;
		inorder(root, 1);
		
		int widestLevel = 1, widestWidth = maxLevel[1] - minLevel[1] + 1;
		for (int i = 2; i <= levelMax; i++) {
			int width = maxLevel[i] - minLevel[i] + 1;
			if (width > widestWidth) {
				widestLevel = i;
				widestWidth = width;
			}
		}
		
		bw.write(widestLevel + " " + widestWidth);
		bw.flush();
		bw.close();
		
	}
	
	public static void inorder (int root, int level) {
		Node rootNode = tree[root];
		if (level > levelMax) {
			levelMax = level;
		}
		
		if (rootNode.left != -1) {
			inorder(rootNode.left, level + 1);
		}
		
		minLevel[level] = Math.min(minLevel[level], cordinate);
		maxLevel[level] = Math.max(maxLevel[level], cordinate);
		cordinate++;
		
		if (rootNode.right != -1) {
			inorder(rootNode.right, level + 1);
		}
	}
	
	public static class Node {
		int parent, left, right;
		
		Node (int left, int right) {
			this.parent = -1;
			this.left = left;
			this.right = right;
		}
	}
	
}
