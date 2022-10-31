import java.util.Scanner;
// Write a program to accept User ID and password checks if the password is valid or not based on password policies mention below:(Using exception Handling) Password should not contain any space. Password should contain at least one digit(0-9). Password length should be between 8 to 15 characters. Password should contain at least one lowercase letter(a-z). Password should contain at least one uppercase letter(A-Z). Password should contain at least one special character ( @, #, %, &, !, $, etc….).
//Custom Exception for Invalid Password Situation
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class passChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking user input
        System.out.println("Enter User ID: ");
        String user_id = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();
        //try catch to check if password matches specified criteria
        try {
            if (password.contains(" ")) {
                throw new InvalidPasswordException("Password should not contain any space");
            }
            if (password.length() < 8 || password.length() > 15) {
                throw new InvalidPasswordException("Password length should be between 8 to 15 characters");
            }
            //initializing boolean variable to store truth value of password attributes/criteria
            boolean hasDigit = false;
            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasSpecial = false;
            for (char c : password.toCharArray()) {
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isLowerCase(c)) {
                    hasLower = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpper = true;
                } else {
                    hasSpecial = true;
                }
            }
            //try catch to throw exception based on boolean values of password attributes
            if (!hasDigit) {
                throw new InvalidPasswordException("Password should contain at least one digit(0-9)");
            }
            if (!hasLower) {
                throw new InvalidPasswordException("Password should contain at least one lowercase letter(a-z)");
            }
            if (!hasUpper) {
                throw new InvalidPasswordException("Password should contain at least one uppercase letter(A-Z)");
            }
            if (!hasSpecial) {
                throw new InvalidPasswordException("Password should contain at least one special character ( @, #, %, &, !, $, etc…)");
            }
            //printing final output if password meets specified criteria
            System.out.println("User ID: "+user_id);
            System.out.println("Password is valid");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
