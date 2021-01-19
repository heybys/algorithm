import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (checkHansoo(i)) {
				count++;
			}
		}

		System.out.println(count);

	}

	public static boolean checkHansoo(int n) {

		String strNum = String.valueOf(n);

		if (strNum.length() == 1) {
			return true;
		}

		Integer gap = null;

		for (int i = 0; i < strNum.length() - 1; i++) {
			int cur = Integer.parseInt(strNum.substring(i, i + 1));
			int nxt = Integer.parseInt(strNum.substring(i + 1, i + 2));

			if (gap != null && gap != (nxt - cur)) {
				return false;
			} else {
				gap = nxt - cur;
			}
		}

		return true;
	}

}
