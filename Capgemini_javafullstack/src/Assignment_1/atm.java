package String;

public class atm {

    private String name;
    private Double money;
    private int pin = 2000;   
    private Double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
        return pin;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getMoney() {
        return money;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount, int pin) {
        if (this.pin == pin) {
            balance = balance + amount;
        }
    }
    public void withdraw(Double amount, int pin) {
        if (this.pin == pin && balance >= amount) {
            balance = balance - amount;
        }
    }
}

