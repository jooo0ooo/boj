import java.util.Scanner;

public class java_2443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		for(int i = size; i > 0; i--) {
			
			for(int k = 0; k < size - i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
