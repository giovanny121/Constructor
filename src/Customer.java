public class Customer extends Person {
    private static int idCounter = 5; // Auto-incremented ID counter
    private int customerID;
    private double balance;

    // Constructor
    public Customer(String name, int age, String username, String password, double balance) {
        super(name, age, username, password);
        this.customerID = idCounter++;  // Automatically generate customerID
        this.balance = balance;
    }

    // Getters and Setters for balance and customerID
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    // Override toString method to include customerID
    @Override
    public String toString() {
        return String.format("%s, CustomerID: %d, Balance: %.2f", super.toString(), customerID, balance);
    }

    // Override equals method to compare by username/password or customerID/password
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Customer customer = (Customer) obj;

        // Compare username/password OR customerID/password
        boolean usernamePasswordMatch = getUsername().equals(customer.getUsername()) &&
                getPassword().equals(customer.getPassword());
        boolean customerIDPasswordMatch = this.customerID == customer.customerID &&
                getPassword().equals(customer.getPassword());

        return usernamePasswordMatch || customerIDPasswordMatch;
    }

    // Override hashCode when overriding equals (Best practice)
    @Override
    public int hashCode() {
        return Integer.hashCode(customerID) + getUsername().hashCode() + getPassword().hashCode();
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating Customers
        Customer customer1 = new Customer("John Doe", 30, "johndoe", "password123", 500.0);
        Customer customer2 = new Customer("Jane Smith", 28, "janesmith", "password456", 1000.0);
        Customer customer3 = new Customer("Mark Spencer", 40, "markspencer", "password789", 1500.0);

        // Testing toString
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);

        // Testing equals method
        Customer customer4 = new Customer("John Doe", 30, "johndoe", "password123", 800.0); // Should match by username/password
        System.out.println(customer1.equals(customer4)); // true (username and password match)

        Customer customer5 = new Customer("John Doe", 30, "wrongusername", "password123", 800.0); // Match by customerID/password
        customer5.customerID = customer1.getCustomerID(); // Manually set same customerID
        System.out.println(customer1.equals(customer5)); // true (customerID and password match)

        System.out.println(customer1.equals(customer2)); // false (neither username/password nor customerID/password match)
    }
}
