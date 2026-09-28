/**
 * Subclass handling specific console sales reporting.
 * Extends the abstract Consoles class.
 */
public class ConsoleSales extends Consoles {

    /**
     * Constructor accepting console type, store name, and total sales.
     * Passes the values up to the superclass constructor.
     */
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    /**
     * Method to print the formatted sales report.
     * Matches the visual structure provided in the sample screenshot.
     */
    public void printReport() {
        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("**************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}