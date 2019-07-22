package java.java_10818;

import java.util.Scanner;

public class java_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();;	 
		}
		
		int min = arr[0], max = arr[0];
		for(int j = 0; j < size; j++) {
			if(min > arr[j]) {
				min = arr[j];
			} else if(max < arr[j]) {
				max = arr[j];
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
