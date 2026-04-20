import java.util.Scanner;

public class Registration {
  
    private static String userName;
    private static String passWord;
    private static String cellPhoneNumber;
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        // USERNAME
        
         System.out.print("Enter your username: ");
             userName = input.nextLine();
       
        while (!(username.length() < 5 && username.contains("_"))) {
           
        
            System.out.println("Username is not correctly formatted");
            
            System.out.print("Enter your username: ");
             userName = input.nextLine();
            
        }

         System.out.println("Username successfully captured");
       
        // PASSWORD
        System.out.print("Enter password: ");
        passWord = input.nextLine();
        while (!(isValidPassword(password))) {
           
        
            System.out.println("Password is not correctly formatted");
            
            System.out.print("Enter password: ");
            passWord = input.nextLine();
            
        }
         System.out.println("Password successfully captured");
        
        // PHONE NUMBER  
        System.out.print("Enter your cell phone(+27...): ");
        cellPhoneNumber = input.nextLine();
        while(!(cellPhoneNumber.matches("\\+27\\d{9}"))) {
          
           
            System.out.println("Cellphone number is not correctly formatted");
            System.out.print("Enter your cell phone(+27...): ");
            cellPhoneNumber = input.nextLine();

        }
          System.out.println("Cellphone number successfully added");
        
        System.out.println(registerUser());
        boolean loginStatus = loginUser(username, password);
        System.out.println(loginMessage(loginStatus));
        
    }
        
    // VALIDATE PASSWORD FORMAT 
    private static boolean isValidPassword(String pass) {
        if (pass.length() < 8) return false;
            
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasNumber && hasSpecial;
    }
    
    // METHOD TO CHECK STANDARD
    public static boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }
    
    public static boolean checkPasswordComplexity() {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
        return password.matches(regex);
    }
    
    public static boolean checkCellPhoneNumber() {
        return cellPhoneNumber.matches("^\\+27\\d{9}$");
    }
    
    public static String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters long.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "User registered successfully";
    }
    
    public static boolean loginUser(String enteredUser, String enteredPass) {
        return username.equals(enteredUser) && password.equals(enteredPass);
    }

    public static String loginMessage(boolean loginStatus) {
        if (loginStatus) {
            return "Welcome " + username + ", it is great to see you again";
        } else {
            return "Username or password incorrect, please try again";
        }
    }
}