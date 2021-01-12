import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Integer> nonSelfNum = new HashSet<>();
		
		for(int i = 1; i <= 10000; i++) {
			if(!nonSelfNum.contains(i)) {
				System.out.println(i);
			}
			
			nonSelfNum.add(d(i));
		}

	}

	public static int d(int n) {
		int res = n;

		int remainder = n % 10;
		int quotient = n / 10;

		while (quotient != 0) {
			res += remainder;

			remainder = quotient % 10;
			quotient /= 10;
		}

		res += remainder;

		return res;
	}

}
