package lab2;

// Интерфейс для банковского счета
interface BankAccount {
    void deposit(double amount); // Метод для депозита
    void withdraw(double amount); // Метод для снятия денег
    double getBalance(); // Метод для получения текущего баланса
}

// Класс, представляющий банковский счет
class Account implements BankAccount {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        System.out.println("Текущий баланс: " + myAccount.getBalance());

        myAccount.deposit(500);
        System.out.println("Текущий баланс после депозита: " + myAccount.getBalance());

        myAccount.withdraw(200);
        System.out.println("Текущий баланс после снятия: " + myAccount.getBalance());
    }
}
