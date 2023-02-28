import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ATMMenu {
    int choiceOne = 1;
    int choiceTwo = 2;

    public static void  launchMenu () throws IOException {

        System.out.println();
        System.out.println("Hello dear ATM user. Please make your choice");
        System.out.println();
        System.out.println("[ 1 ] - Create a new account");
        System.out.println("[ 2 ] - Log in with my account");
        System.out.println("[ 3 ] - Exit");
        System.out.println();
        System.out.println("Enter menu item number");

        BufferedReader makeChoice = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(makeChoice.readLine());
        if (choice > 0 && choice <= 3) {
            if (choice == 1) {
                Account.createAccountMenu();
            } else if (choice == 2) {
                System.out.println("item2");
            } else {
                makeChoice.close();

            }
        } else  {System.out.println("Wrong number. Please enter correct number");
            launchMenu();
        }
        makeChoice.close();

    }


}
