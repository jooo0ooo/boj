import java.util.Scanner;

public class java_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 int first, second;
		 for(int i = 0; i < size; i++) {
			 
			 first = s.nextInt();
			 second = s.nextInt();
			 arr[i] = first + second;	 
		 }
		 
		 for(int j = 0 ; j < size; j++) {
			 System.out.println(arr[j]);
		 }
	}

}
