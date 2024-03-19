import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Account class representing a bank account
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Customer class representing a bank customer
class Customer {
    private String customerId;
    private String name;
    private String address;

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Bank class managing accounts and customers
class Bank {
    private Map<String, Account> accounts;
    private Map<String, Customer> customers;

    public Bank() {
        accounts = new HashMap<>();
        customers = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public Customer getCustomer(String customerId) {
        return customers.get(customerId);
    }
}

// Main class containing the main method and user interface
public class BankManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer(new Customer("C001", "Alice", "123 Main St"));
        bank.addCustomer(new Customer("C002", "Bob", "456 Elm St"));
        bank.addAccount(new Account("A001", 1000));
        bank.addAccount(new Account("A002", 2000));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBank Management System");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber1 = scanner.next();
                    Account account1 = bank.getAccount(accountNumber1);
                    if (account1 != null) {
                        System.out.print("Enter amount to deposit: ");
                        double amount1 = scanner.nextDouble();
                        account1.deposit(amount1);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String accountNumber2 = scanner.next();
                    Account account2 = bank.getAccount(accountNumber2);
                    if (account2 != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double amount2 = scanner.nextDouble();
                        account2.withdraw(amount2);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}