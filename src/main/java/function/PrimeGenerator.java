package function;

class PrimeGenerator {
    private final int ordmax = 30;
    private int candidate;
    private int primeIndex;
    private int ord;
    private int square;
    private int[] multiples;

    public PrimeGenerator() {
        multiples = new int[ordmax + 1];
        candidate = 1;
        primeIndex = 1;
        ord = 2;
        square = 9;
    }

    public int[] generatePrimes(int numberOfPrimes) {
        int primes[] = new int[numberOfPrimes + 1];
        boolean possiblyPrime;
        int n;
        while (primeIndex < numberOfPrimes) {
            do {
                candidate = candidate + 2;
                if (candidate == square) {
                    ord = ord + 1;
                    square = primes[ord] * primes[ord];
                    multiples[ord - 1] = candidate;
                }
                n = 2;
                possiblyPrime = true;
                while (n < ord && possiblyPrime) {
                    while (multiples[n] < candidate)
                        multiples[n] = multiples[n] + primes[n] + primes[n];
                    if (multiples[n] == candidate)
                        possiblyPrime = false;
                    n = n + 1;
                }
            } while (!possiblyPrime);
            primeIndex = primeIndex + 1;
            primes[primeIndex] = candidate;
        }
        return primes;
    }
}
