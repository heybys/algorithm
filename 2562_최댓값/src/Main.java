import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT 3 29 38 12 57 74 40 85 61
	 * 
	 * OUTPUT 85 8
	 */

	public static void main(String[] args) {

		int max = 0;
		int pos = 0;

		for (int i = 0; i < 9; i++) {
			int N = scan.nextInt();

			if (N > max) {
				max = N;
				pos = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(pos);
	}

}
