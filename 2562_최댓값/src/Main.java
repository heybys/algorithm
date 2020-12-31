import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

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
