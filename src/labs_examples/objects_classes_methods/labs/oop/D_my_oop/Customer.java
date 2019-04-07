package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Customer {

    private String customerName;
    private int initialDeposit;
    private BankAccount bankAccount;

    public Customer(String customerName, int initialDeposit) {
        this.customerName = customerName;
        this.initialDeposit = initialDeposit;
        bankAccount = new BankAccount(initialDeposit);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", initialDeposit=" + initialDeposit +
                '}';
    }
}
