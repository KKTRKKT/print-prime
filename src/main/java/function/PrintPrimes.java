package function;

public class PrintPrimes {

    public static void main(String[] args) {
        final int numberOfPrimes = 1000;
        PrimeGenerator generator = new PrimeGenerator();
        int[] primes = generator.generatePrimes(numberOfPrimes);
        new NumberPrinter(50, 4).printNumbers(numberOfPrimes, primes);
    }

}
