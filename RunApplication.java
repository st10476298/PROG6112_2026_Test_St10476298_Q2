import java.util.Scanner;

/**
 * Main application class to run the console sales program.
 */
public class RunApplication {
    
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display menu for console selection exactly as per the sample screenshot
        System.out.println("Select the beverage type"); 
        System.out.println(" 1) PS5");
        System.out.println(" 2) XBOX");
        System.out.println(" 3) SWITCH");
        
        // Capture user choice
        int choice = Integer.parseInt(scanner.nextLine());
        String consoleType = "";

        // Assign the correct string based on the user's choice
        switch (choice) {
            case 1: 
                consoleType = "PS5"; 
                break;
            case 2: 
                consoleType = "XBOX"; 
                break;
            case 3: 
                consoleType = "SWITCH"; 
                break;
            default: 
                consoleType = "Unknown"; 
                break;
        }

        // Prompt for the store name
        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        // Prompt for total sales dynamically using the selected console and store
        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = Integer.parseInt(scanner.nextLine());

        // Instantiate the ConsoleSales class with the captured data
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Call the method to print the final formatted report
        salesReport.printReport();
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}