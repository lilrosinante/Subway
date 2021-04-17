import Bread.Bread;
import DecoratorPattern.Cheese.Cheddar;
import DecoratorPattern.Cheese.Mozzarella;
import DecoratorPattern.Extra.ExtraBacon;
import DecoratorPattern.Extra.ExtraCheese;
import DecoratorPattern.Sauce.BBQ;
import DecoratorPattern.Sauce.Chipotle;
import DecoratorPattern.meat.BBQRib;
import DecoratorPattern.meat.ChickenTeriyaki;
import DecoratorPattern.salad.Cucumber;
import DecoratorPattern.salad.Pepper;
import ENUM.BreadType;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    private ArrayList<Bread> sandwiches = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private BreadFactory breadFactory = new BreadFactory();

    public void start() {

        Bread sandwich = null;
        String wantAnotherSandwich;

        System.out.print("WELCOME TO THE OFFICIAL ONLINE SUBWAY WEBSITE\n" +
                "---------------------------------------------\n" +
                "Hello guest\n");
        do {
            sandwich = chooseBread(sandwich, false);

            sandwich = chooseMeat(sandwich, false);

            sandwich = chooseCheese(sandwich, false);

            sandwich = chooseExtra(sandwich, false);

            sandwich = chooseSalad(sandwich, false);

            sandwich = chooseSauce(sandwich, false);

            sandwiches.add(sandwich);

            System.out.println("\n\nYou've finished the assembly of your sub. Would you like to create another one? (Y / N): ");
            wantAnotherSandwich = scan.next();

        } while (wantAnotherSandwich.equalsIgnoreCase("Y"));

        printOrder(sandwiches);

    }

    public Bread chooseBread(Bread sandwich, boolean pass){
        do {
            System.out.print("What bread would you like to eat?\n" +
                    "Options: Cheese Oregano (1) or Honey Oat (2)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = breadFactory.chooseBread(BreadType.CHEESEOREGANO);
                    pass = true;
                    break;
                case 2:
                    sandwich = breadFactory.chooseBread(BreadType.HONEYOAT);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public Bread chooseMeat(Bread sandwich, boolean pass){
        do {
            System.out.print("\n---------------------------------------------\n" +
                    "What meat would you like to have in your sub?\n" +
                    "Options: BBQRib (1), Chicken Teriyaki (2) or No Meat (3)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = new BBQRib(sandwich);
                    pass = true;
                    break;
                case 2:
                    sandwich = new ChickenTeriyaki(sandwich);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public Bread chooseCheese(Bread sandwich, boolean pass){
        do {
            System.out.print("\n---------------------------------------------\n" +
                    "What cheese would you like to have in your sub?\n" +
                    "Options: Cheddar (1), Mozzarella (2) or No Cheese (3)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = new Cheddar(sandwich);
                    pass = true;
                    break;
                case 2:
                    sandwich = new Mozzarella(sandwich);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public Bread chooseExtra(Bread sandwich, boolean pass){
        do {
            System.out.print("\n---------------------------------------------\n" +
                    "What extra would you like to have in your sub?\n" +
                    "Options: Extra Bacon (1), Extra Cheese (2) or No Extras (3)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = new ExtraBacon(sandwich);
                    pass = true;
                    break;
                case 2:
                    sandwich = new ExtraCheese(sandwich);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public Bread chooseSalad(Bread sandwich, boolean pass){
        do {
            System.out.print("\n---------------------------------------------\n" +
                    "What salad would you like to have in your sub?\n" +
                    "Options: Cucumber (1), Pepper (2) or No Salad (3)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = new Cucumber(sandwich);
                    pass = true;
                    break;
                case 2:
                    sandwich = new Pepper(sandwich);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public Bread chooseSauce(Bread sandwich, boolean pass){

        do {
            System.out.print("\n---------------------------------------------\n" +
                    "What sauce would you like to have in your sub?\n" +
                    "Options: BBQ (1), Chipotle (2) or No Sauce (3)\n\n" +
                    "Enter number here: ");
            int decision = scan.nextInt();

            switch (decision) {
                case 1:
                    sandwich = new BBQ(sandwich);
                    pass = true;
                    break;
                case 2:
                    sandwich = new Chipotle(sandwich);
                    pass = true;
                    break;
                default:
                    System.out.println("\nInvalid Input. Please enter a valid number.\n");
                    break;
            }
        } while (!pass);

        return sandwich;
    }

    public void printOrder (ArrayList<Bread> sandwiches) {

        for (int i = 1; i < sandwiches.size() + 1; i++) {
            System.out.println("\nSandwich " + i + "\n" +
                               "Price: " + sandwiches.get(i-1).cost());
        }
    }
}
