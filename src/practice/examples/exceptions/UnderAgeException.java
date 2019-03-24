package practice.examples.exceptions;

public class UnderAgeException extends Exception {

    @Override
    public String toString() {
        return "UnderAgeException{Must be 21 to buy alcohol in the US}";
    }
}
