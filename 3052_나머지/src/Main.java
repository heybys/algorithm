import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner scan = new Scanner(System.in);

	/*
	 * INPUT#1 1 2 3 4 5 6 7 8 9 10
	 * 
	 * OUTPUT#1 10
	 * 
	 * INPUT#2 42 84 252 420 840 126 42 84 420 126
	 * 
	 * OUTPUT#2 1
	 * 
	 * INPUT#3 39 40 41 42 43 44 82 83 84 85
	 * 
	 * OUTPUT#3 6
	 */
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			int n = scan.nextInt();
			
			n %= 42;
			
			set.add(n);
		}
		
		System.out.println(set.size());

	}

}
