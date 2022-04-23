package function;

public class PrintPrimes {
    static final int numberOfPrimes = 1000;
    static final int linesPerPage = 50;
    static final int columns = 4;

    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeGenerator();
        int[] primes = generator.generatePrimes(numberOfPrimes);
        NumberPrinter printer = new NumberPrinter(linesPerPage, columns);
        printer.printNumbers(numberOfPrimes, primes);
    }

}
