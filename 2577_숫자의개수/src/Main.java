import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int mul = A * B * C;

		String mulStr = Integer.toString(mul);

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < 10; i++) {
			char c = Character.forDigit(i, 10);
			map.put(c, 0);
		}

		mulStr.chars().mapToObj(i -> (char) i).forEach(c -> {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		});

		map.entrySet().forEach(entry -> {
			System.out.println(entry.getValue());
		});

	}

}
