import java.util.Date;

public class Account {
    //private data
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    //id and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    //method for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //method for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    //return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    //return the monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    //withdraw a specified amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    //deposit a specified amount
    public void deposit(double amount) {
        balance += amount;
    }
       //test
    public static void main(String[] args) {
        //create account
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        //withdraw $2,500
        account.withdraw(2500);

        //deposit $3,000
        account.deposit(3000);

        //print account data
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Account Created On: " + account.getDateCreated());