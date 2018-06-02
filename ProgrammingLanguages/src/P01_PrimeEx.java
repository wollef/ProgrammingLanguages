public class P01_PrimeEx {

	public static void main(String[] args) {

		System.out.println("54161329 : " + isPrime(54161329) + " (expect false)");
		System.out.println("1882341361 : " + isPrime(1882341361) + " (expect true)");
		System.out.println("2 : " + isPrime(2) + " (expect true)");

	}

	// pre: num >= 2
	public static boolean isPrime(int num) {
		assert num >= 2 : "failed precondition. num must be >= 2. num: " + num;
		final double LIMIT = Math.sqrt(num);
		boolean isPrime = (num == 2) ? true : num % 2 != 0;
		int div = 3;
		while(div <= LIMIT && isPrime) {
			isPrime = num % div != 0;
			div += 2;
		}
		return isPrime;

	}

}