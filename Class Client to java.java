import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Client {
    private static int numberOfClients = 0;
    private String id;
    private String name;
    private List<Account> accounts;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
        numberOfClients++;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public static int getNumberOfClients() {
        return numberOfClients;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

class Account {
    private String number;
    private String currency;
    private double balance;
    private List<Transaction> transactions;

    public Account(String number, String currency, double balance) {
        this.number = number;
        this.currency = currency;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public Account(String number, String currency) {
        this(number, currency, 0.0);
    }

    public void makeDeposit(double amount, String note) {
        this.transactions.add(new Transaction(this.currency, amount, note));
        this.balance += amount;
    }

    public void makeWithdrawal(double amount, String note) {
        this.transactions.add(new Transaction(this.currency, -amount, note));
        this.balance -= amount;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

class Transaction {
    private String currency;
    private double amount;
    private String note;
    private Date timeStamp;

    public Transaction(String currency, double amount, String note) {
        this.currency = currency;
        this.amount = amount;
        this.note = note;
        this.timeStamp = new Date();
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("123456", "Anna"));
        clients.add(new Client("987654", "Oskar"));
        clients.add(new Client("456123", "Jenifer"));

        clients.get(0).addAccount(new Account("EE654987564321", "EUR", 1000.0));
        clients.get(0).addAccount(new Account("JP582147859635", "JPY", 25000.30));
        clients.get(0).addAccount(new Account("US654987643214", "USD"));
        clients.get(1).addAccount(new Account("PL849512635445", "PLN", 47800.00));
        clients.get(2).addAccount(new Account("SE741254956587", "SEK", 200.18));

        clients.get(0).getAccounts().get(0).makeDeposit(1200, "Salary");
        clients.get(0).getAccounts().get(0).makeWithdrawal(50, "Grocery");
        clients.get(0).getAccounts().get(0).makeWithdrawal(140, "Clothes");
        clients.get(0).getAccounts().get(0).makeWithdrawal(20, "Dinner");

        System.out.println("We have " + Client.getNumberOfClients() + " clients in our bank:");

        for (Client client : clients) {
            System.out.println("Client " + client.getName() + " has the following accounts:");
            for (Account account : client.getAccounts()) {
                System.out.println("  Account Number: " + account.getNumber() + ", Balance: " + account.getBalance() + ", Currency: " + account.getCurrency());
                for (Transaction transaction : account.getTransactions()) {
                    System.out.println("    " + transaction.getTimeStamp() + " - Amount: " + transaction.getAmount() + ", Currency: " + transaction.getCurrency() + ", Note: " + transaction.getNote());
                }
            }
        }
    }
}
