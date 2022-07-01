public class ValidatePassword {

    public static void main(String[] args) {
        String password = "quetz";
        System.out.println(testPasswordLength(password));
        System.out.println(testPasswordForNumbers(password));
    }

    public static boolean testPasswordLength(String password) {
        if (password.length() < 8) {
            System.out.println("Your password is too short.");
            return false;
        }
        return true;
    }

    public static boolean testPasswordForNumbers(String password) {
        char[] passwordArray = password.toCharArray();
        for (int numbers = 0; numbers < password.length(); ++numbers) {
            if (Character.isDigit(passwordArray[numbers])) {
                return true;
            }
        }
        System.out.println("Your password contains no numbers.");
        return false;
    }
}