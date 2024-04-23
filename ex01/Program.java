import java.io.*;
import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		int	x;
		int i;
		int count;
		boolean checkPrime;

		Scanner	scn = new Scanner(System.in);
		checkPrime = true;
		i = 2;
		count = 1;
		x = scn.nextInt();
		if (x <= 1) {
			System.err.println("IllegalArgument");
			System.exit(-1);
		}
		while ((x >= (i * i)) && (checkPrime)) {
			if (x % i == 0) {
				checkPrime = false;
			}
			else {	
				count++;
				i++;
			}
		}
		System.out.println(checkPrime + " " + count);
		System.exit(0);
	}
}
