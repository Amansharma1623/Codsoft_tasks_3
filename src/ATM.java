import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance){
        this.balance = initialBalance;
    }

    public void displayManu(){
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
    }

    public void processOption(int option){
        if(option == 1){
            checkBalance();
        } else if(option == 2){
            withdraw();
        } else if(option == 3) {
            deposit();
        } else if(option == 4) {
            System.out.println("Exiting...");
            System.exit(0);
        } else {
            System.out.println("Invalid option");
        }
    }
    private void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
    private void withdraw(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount in withdraw: ");
        double amount = scn.nextDouble();
        if(amount > balance){
            System.out.println("Insufficiant balance");
        } else {
            balance -= amount;
            System.out.println("Withdraw succesful, balance: " + balance);
        }
    } private void deposit(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scn.nextDouble();
        balance += amount;
        System.out.println("Deposit Successful. Current Balance: " + balance);
    }
}
