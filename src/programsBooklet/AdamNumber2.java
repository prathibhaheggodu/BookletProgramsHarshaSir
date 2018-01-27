package programsBooklet;

public class AdamNumber2 {

	public static void main(String[] args) {

		// take the number --12===int a
		// find the square of the number--144===int sq
		// take the reverse of number 12, 21====int rev
		// find the square of the reversenumber of 21, 441 int revsq
		// take the reverse of of revsq ie 441 ==int revrsq
		// compare values

		int a, rev, sq, revsq, revrevsq;
		System.out.println("The adams number are: ");

		AdamNumber2 an = new AdamNumber2();
		for (int num = 1; num <= 1000; num++) {
			a = num;
			sq = an.square(a);

			rev = an.reverse(a);

			revsq = an.square(rev);

			revrevsq = an.reverse(revsq);

			if (sq == revrevsq) {
				System.out.println(a);

			}
		}
	}

	int square(int n) {
		return n * n;

	}

	int reverse(int num) {
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

}
