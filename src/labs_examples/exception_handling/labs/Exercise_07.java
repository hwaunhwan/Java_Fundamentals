package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class Exercise_07{
    public static void main(String[] args) {
        try {
            Wallet myWallet = new Wallet();
//            myWallet.setCash(100);
            myWallet.setCash(-100);
            System.out.println(myWallet.getCash());
        } catch (NegativeBalanceException exc){
            System.out.println(exc.toString());
        }
    }
}

class Wallet {
    private int cash;

    public void setCash(int cash) throws NegativeBalanceException {
        if(cash < 0) {
            throw new NegativeBalanceException();
        } else {
            this.cash = cash;
        }
    }

    public int getCash() {
        return cash;
    }
}

class NegativeBalanceException extends Exception {
    @Override
    public String toString() {
        return "You can't put negative value of cash into your wallet";
    }
}