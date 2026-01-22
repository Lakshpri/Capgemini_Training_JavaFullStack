package String;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 2000;   
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial money: ");
        Double money = sc.nextDouble();

        customer c = new customer(name, money);
        System.out.println("Initial Balance: " + c.getBalance());

        System.out.print("Enter deposit amount: ");
        Double dep = sc.nextDouble();
        c.deposit(dep, pin);

        System.out.println("Balance after deposit: " + c.getBalance());

        System.out.print("Enter withdraw amount: ");
        Double wit = sc.nextDouble();
        c.withdraw(wit, pin);

        System.out.println("Final Balance: " + c.getBalance());

        sc.close();
    }
}
