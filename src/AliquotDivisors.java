
/** Write a program to find the aliquot sum of a given number. */
public class AliquotDivisors {

	public static void main(String[] args) {
		AliquotDivisors aliquotDivisors = new AliquotDivisors(); // creating
																	// object
		System.out.println("Aliquot sum of 12 is " + aliquotDivisors.findAliquotSum(12));//  calling the method findAliquotSum

		// perfect numbers between 1 to 100
		System.out.println("Perfect numbers between 1 and 100 are: ");
		for (int i = 1; i <= 100; i++) {// for loop
			if (aliquotDivisors.findAliquotSum(i) == i) { // if case
				System.out.print(i + " ");
			}
		}

	}
// creating method
	public long findAliquotSum(int n) {
		long aliquotSum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				aliquotSum = aliquotSum+i;
			}
		}

		return aliquotSum;
	}

}
