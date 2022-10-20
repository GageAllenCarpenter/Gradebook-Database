/**
 * Each Package has its corresponding model and controller
 * The RepoBase package is the base for all the other repositories
 * The Application Class is the driver for the application
 * You must have SQL Server installed and running on your machine, JDBC driver installed, and the database created
 * 
 * @author Gage Carpenter
 * @Version 2021.04.23.01
 */
public class Main {

    /**
     * entry point of the application that creates an instance of the Application class and calls
     * the start method
     */
    public static void main(String[] args) {
        try{
            new Application().start();
        }catch (Exception ex){
            System.out.println("Ensure that the database is running and that the connection string is correct.");
            System.out.println(ex.getMessage());
        }
    }
}
