import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1, 3, 2, 4, 5};
		int[] myArray2 = new int[3];
		int i;
		Scanner scan = new Scanner(System.in);
		for(i = 0; i < 3; i ++) {
			myArray2[i] = scan.nextInt();
		}
	}
}
