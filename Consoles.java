/**
 * Abstract class representing generic console sales data.
 * Implements the IConsoles interface.
 */
public abstract class Consoles implements IConsoles {
    // Variables to store console details as required
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    /**
     * Constructor to initialize the console data.
     */
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementation of interface methods to return the stored variables
    @Override
    public String getConsoleType() {
        return this.consoleType;
    }

    @Override
    public String getStore() {
        return this.storeName;
    }

    @Override
    public int getTotalSales() {
        return this.totalSales;
    }
}
