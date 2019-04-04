package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class BankAccount {

//    private String accountHolderName;
    private String accountNumber;
    private int currentBalance;

    public int deposit(int amount){
        if (amount > 0) {
            this.currentBalance = currentBalance + amount;
            return amount;
        } else {
            return 0;
        }
    }

    public void withdraw(int amount){
        if (amount > 0) {
            this.currentBalance = currentBalance + amount;
        }
    }

    public int checkBalance(){
        return currentBalance;
    }

}
