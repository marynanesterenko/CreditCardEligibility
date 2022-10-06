import java.util.Scanner;

public class CreditCardEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is you salary? ");
        double salary = sc.nextDouble();
        while (salary < 0){
            System.out.println("The salary amount you've entered is invalid," +
                    " the number entered cannot be less than 0.");
            salary = sc.nextDouble();
        }

        System.out.println("PLease enter your age: ");
        int age = sc.nextInt();
        while (age < 0 || age > 120){
            System.out.println("The age you've entered is invalid," +
                    "the number entered cannot be less than 0 or more than 120.");
            age = sc.nextInt();
        }

        if (age < 18){
            System.out.println("You are not eligible. You must be 18 or order in order to apply for a credit card.");
        } else {
            if (salary < 5000){
                System.out.println("Thank you for applying! Your income is not enough to be qualified." +
                        "\nYou must make $5000 or more in order to be qualified.");
            }
            else if (salary >= 5000 && salary < 20000) {
                System.out.println("Congratulations! You are qualified for a credit card!");
            }
            else {
                System.out.println("Congratulations! You are qualified for a credit card with a $200 sign up bonus!");
            }
        }
    }
}
