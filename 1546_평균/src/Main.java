import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT#1 3 40 80 60
	 * 
	 * OUTPUT#1 75.0
	 * 
	 * INPUT#2 3 10 20 30
	 * 
	 * OUTPUT#2 66.666667
	 * 
	 * INPUT#3 4 1 100 100 100
	 * 
	 * OUTPUT#3 75.25
	 */
	public static void main(String[] args) {

		int n = scan.nextInt();

		int max = 0;
		float sum = 0;

		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt();
			
			if(temp > max) {
				max = temp;
			}
			
			sum += temp;
		}

		sum /= n;

		System.out.println(sum * 100 / max);

	}

}
