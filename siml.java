import java.util.Scanner;

class InvalidCreditCardException extends Exception {
    public InvalidCreditCardException(String message) {
        super(message);
    }
}

public class siml {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardNumber = sc.nextLine();

        try {
            if (cardNumber.length() != 16) {
                throw new InvalidCreditCardException(
                    "Invalid credit card number length."
                );
            }

            if (!cardNumber.matches("[0-9]{16}")) {
                throw new InvalidCreditCardException(
                    "Invalid credit card number format."
                );
            }

            System.out.println("Payment information updated successfully!");
        } catch (InvalidCreditCardException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}//so todays hm hmhmhmhm