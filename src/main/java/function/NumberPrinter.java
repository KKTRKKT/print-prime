package function;

public class NumberPrinter {
    int column;
    int pagenumber;
    int pageoffset;
    int rowoffset;
    int linesPerPage;
    int columns;

    public NumberPrinter(int linesPerPage, int columns) {
        this.linesPerPage = linesPerPage;
        this.columns = columns;
        pagenumber = 1;
        pageoffset = 1;
    }

    public void printNumbers(int numberOfPrimes, int[] primes) {
        while (pageoffset <= numberOfPrimes) {
            System.out.println("The First " + numberOfPrimes +
                    " Prime Numbers --- Page " + pagenumber);
            System.out.println("");
            for (rowoffset = pageoffset; rowoffset < pageoffset + linesPerPage; rowoffset++) {
                for (column = 0; column < columns; column++)
                    if (rowoffset + column * linesPerPage <= numberOfPrimes)
                        System.out.format("%10d", primes[rowoffset + column * linesPerPage]);
                System.out.println("");
            }
            System.out.println("\f");
            pagenumber = pagenumber + 1;
            pageoffset = pageoffset + linesPerPage * columns;
        }
    }
}
