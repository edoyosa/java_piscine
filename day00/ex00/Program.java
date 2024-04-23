import	java.io.*;

class Program {
	public static void main(String[] args) {
		int	x;
		int	sum;

		x = 479598;
		sum = 0;
		if (x >= 100000 && x < 1000000) {
			while (x != 0) {
				sum += x % 10;
				x /= 10;
			}
			System.out.println(sum);
			System.exit(0);
		}
		else {
			System.out.println("Number MUST be a six-digit int number!!");
			System.exit(1);
		}
	}
}
