public class BankCustomer1 {
    String name;
    String accountNumber;
    int age;

    public BankCustomer1(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }
        public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
    }

    public static void main(String[] args) {
        BankCustomer1 customer = new BankCustomer1("Varun", "1234567890", 20);
        customer.displayDetails();
    }
}