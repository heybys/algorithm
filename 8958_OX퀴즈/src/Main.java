import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT 5 OOXXOXXOOO OOXXOOXXOO OXOXOXOXOXOXOX OOOOOOOOOO OOOOXOOOOXOOOOX
	 * 
	 * OUPUT 10 9 7 55 30
	 */

	public static void main(String[] args) {

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			String str = scan.next();

			char[] chars = str.toCharArray();

			int sum = 0;
			int cur = 0;

			for (char c : chars) {
				if (c == 'O') {
					cur++;
					sum += cur;
				} else {
					cur = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
