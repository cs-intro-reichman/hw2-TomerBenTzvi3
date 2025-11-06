// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");
		for (int seed = 1; seed <= N; seed++) {
			int n = seed;
			int steps = 1;
			if (verbose) {
				System.out.print(seed + " ");
			}
			do {
				if (n % 2 == 0) {
					n = n / 2;
				} else {
					n = (n * 3) + 1;
				}
				if (verbose) {
				System.out.print(n + " ");
				}
				steps ++;
			} while (n != 1); 
			if (verbose) {
				System.out.print("(" + steps + ")");
				System.out.println();
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
