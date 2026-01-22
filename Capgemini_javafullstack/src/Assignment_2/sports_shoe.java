package Assignment_2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sports_shoe {

    public static void main(String[] args) {

        Shoe[] shoes = {
            new Shoe(3500, "Black", 9, "Nike", "sneaker"),
            new Shoe(4200, "White", 8, "Adidas", "sneaker"),
            new Shoe(3000, "Blue", 10, "Puma", "sneaker"),
            new Shoe(4500, "Black", 9, "Nike", "sports"),
            new Shoe(4800, "White", 8, "Adidas", "sports"),
            new Shoe(6000, "Black", 9, "Bata", "formal"),
            new Shoe(6500, "Brown", 8, "Hush Puppies", "formal"),
            new Shoe(3200, "Yellow", 8, "Skechers", "sneaker"),
            new Shoe(4700, "Grey", 9, "Fila", "sports"),
            new Shoe(6800, "Black", 10, "Louis Philippe", "formal")
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("----- ALL SHOES -----");
        for (Shoe s : shoes) {
            System.out.println(s);
        }

        while (true) {
            try {
                System.out.println("\nSelect Shoe Type:");
                System.out.println("1. Sneaker");
                System.out.println("2. Sports");
                System.out.println("3. Formal");
                System.out.println("0. Exit");

                int choice = sc.nextInt();
                String selectedType;

                if (choice == 0) {
                    System.out.println("Program closed. Thank you!");
                    break;
                }

                switch (choice) {
                    case 1:
                        selectedType = "sneaker";
                        break;
                    case 2:
                        selectedType = "sports";
                        break;
                    case 3:
                        selectedType = "formal";
                        break;
                    default:
                        throw new InvalidShoeChoiceException("Enter only 1, 2, or 3.");
                }

                int count = 0;
                for (Shoe s : shoes) {
                    if (s.type.equalsIgnoreCase(selectedType)) {
                        count++;
                    }
                }

                Shoe[] filtered = new Shoe[count];
                int index = 0;

                for (Shoe s : shoes) {
                    if (s.type.equalsIgnoreCase(selectedType)) {
                        filtered[index++] = s;
                    }
                }

                Arrays.sort(filtered); 

                System.out.println("\n----- " + selectedType.toUpperCase() + " SHOES -----");
                for (int i = 0; i < filtered.length; i++) {
                    System.out.println((i + 1) + ". " + filtered[i]);
                }

                System.out.println("\nEnter shoe number to BUY (0 to cancel):");
                int buyChoice = sc.nextInt();

                if (buyChoice == 0) {
                    System.out.println("Purchase cancelled.");
                } else if (buyChoice < 1 || buyChoice > filtered.length) {
                    System.out.println("Invalid shoe number!");
                } else {
                    Shoe boughtShoe = filtered[buyChoice - 1];
                    System.out.println("\n Successfully purchased:");
                    System.out.println(boughtShoe);
                }

            } catch (InvalidShoeChoiceException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next();
            }
        }
        sc.close();
    }
}
