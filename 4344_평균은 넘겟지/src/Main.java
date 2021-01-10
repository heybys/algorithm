import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT 5 5 50 50 70 80 100 7 100 95 90 80 70 60 50 3 70 90 80 3 70 90 81 9 100
	 * 99 98 97 96 95 94 93 91
	 * 
	 * OUTPUT 40.000% 57.143% 33.333% 66.667% 55.556%
	 */
	public static void main(String[] args) {

		int repeat = scan.nextInt();

		for (int i = 0; i < repeat; i++) {
			int n = scan.nextInt();

			List<Integer> scores = new ArrayList<>();
			float sum = 0;

			for (int j = 0; j < n; j++) {
				int score = scan.nextInt();

				sum += score;
				scores.add(score);
			}

			float avg = sum / (float) n;

			int count = 0;
			for (Integer sc : scores) {
				if (sc > avg) {
					count++;
				}
			}
			float ratio = Math.round(((float) count / (float) n) * 100000) / (float) 1000;

			System.out.printf("%.3f", ratio);
			System.out.println("%");
		}
	}

}
