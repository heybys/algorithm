import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT 5 20 10 35 30 7
	 * 
	 * OUTPUT 7 35
	 */
	public static void main(String[] args) {
		int N = scan.nextInt();
		int max = 0;
		int min = 0;

		for (int i = 0; i < N; i++) {
			int n = scan.nextInt();

			if (i == 0) {
				max = n;
				min = n;
			} else if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}

		System.out.println(min + " " + max);
	}

}
