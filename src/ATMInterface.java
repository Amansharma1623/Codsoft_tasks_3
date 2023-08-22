import java.util.Scanner;

public class ATMInterface {
    public static void main(String[] args){
        double initialBalance = 1000;

        ATM atm;
        atm = new ATM(initialBalance);
        Scanner scn = new Scanner(System.in);

        while (true){
            atm.displayManu();
            System.out.print("Enter your option: ");
            int option = scn.nextInt();
            atm.processOption(option);
            System.out.println();
        }
    }
}
