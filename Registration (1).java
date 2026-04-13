import java.util.Scanner;

public class Registration {
  
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    String user, pass, phone;
    
    //USERNAME
    System.out.print("Enter your username:");
       user = input.nextline();
       if(user.length() > 5 && user.contains("_")){
         System.out.println("Username successfully captured");
       }else{
         System.out.println("Username is not correctly formatted");
         return;
       }
       
       //PASSWORD
       System.out.print("Enter password");
       pass = input.nextline();
       if(pass.length() >= 8) {
         System.out.println("Password successfully captured");
        }else{
          System.out.println("Password is not correctly formatted");
          return;
        }
        
        //PHONE NUMBER  
        System.out.print("Enter your cell phone(+27...):");
            phone = input.nextline();
            if(phone.matches("\\+27\\d{9}")){
              System.out.println("Cellphone number successfully added");
            }else{
              System.out.println("Cellphone number is not correctly formatted");
            }
            input.close();
          }
        }
        
          //VALIDATE PASSWORD FORMAT 
          private static boolean isValidPassword(String pass) {
            if(pass.length() < 8 )return false;
            
            Boolean hasUpper = false;
            Boolean hasNumber = false;
            Boolean hasSpecial = false;
            for(char ch: pass.toCharArray()) {
              if(Character.isUpperCase(ch))
              hasUpper = true;
              else if(Character.isDigit(ch))
              hasNumber = true;
              else if(!Character.isLetterOrDigit(ch))
              hasSpecial = true;
          }else{
          return hasUpper && hasNumber && hasSpecial;
          }
         //METHOD TO CHECK STANDARD
          public boolean checkUserName() {
            String username = "^.{1,5}_.*$";
            return username.matches(username);
          }
          public boolean checkPasswordComplexity() {
             String pass = "^(?=.*[A-Z])(?=.*&\\d)";
             return pass.matches(pass);
             }
             public boolean checkCellPhoneNumber() {
              String cellphone = "^\\+27\\d{9}$";
              return cellPhoneNumber.matches(cellphone);
             }  

          public String loginMessage(boolean loginStatus) {
            if(loginStatus) {
              return "Welcome" + username + ",it is great to see you again"
              }else{
                return "Username or password incorrect, please try again";
              }
          
             public static void main(String[]args) {
              Login login = new login("kyl_1", "Password1!", "+27838968976");
               System.out.println(login.registerUser());
               boolean loginStatus = login.loginUser("kyl_1", "Password1!");
               System.out.println(login.loginMessage(loginStatus));
             } 
            

          
        
       
       
  
