
public class Primes {
	
    /**
     * Return the smallest prime greater than or equal to n.
     *
     * @param n a positive number.
     * @return the smallest prime greater than or equal to n,
     * or -1 if n is negative
     */
    public static int nextPrime(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        n |= 1;//make sure n is odd
        if (n == 1) {
            return 1;
        }

        if (isPrime(n)) {
            return n;
        }

        final int rem = n % 3;
        if (0 == rem) {
            n += 2;
        } else if (1 == rem) {
            n += 4;
        }
        while (true) {
            if (isPrime(n)) {
                return n;
            }
            n += 2;
            if (isPrime(n)) {
                return n;
            }
            n += 4;
        }
    }
    
    /*
     * Naive method to determine whether a number is prime.
     * Note that you are **not** expected to test this method!
     */
    public static boolean isPrime(int n) {
    	if (n < 2) return false;

    	for (int k = 2; k <= Math.sqrt(n); k++) {
    		if (n % k == 0) return false;
    	}
    	return true;
    }
    

}
