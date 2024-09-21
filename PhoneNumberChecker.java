import java.util.Scanner;  

public class PhoneNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter phone number starting with +96171 or +96176: ");
        String phoneNumber = scanner.nextLine();  

        String provider = "Unknown";  

        if (phoneNumber.length() >= 7 && phoneNumber.substring(0, 6).equals("+96171")) {
            char firstDigit = phoneNumber.charAt(6); 
            if (firstDigit >= '1' && firstDigit <= '5') {
                provider = "MTC Touch";  
            } else {
                provider = "Alfa";  
            }
        } 
        
        else if (phoneNumber.length() >= 7 && phoneNumber.substring(0, 6).equals("+96176")) {
            char firstDigit = phoneNumber.charAt(6);  
            if (firstDigit >= '1' && firstDigit <= '5') {
                provider = "Alfa"; 
            } else {
                provider = "MTC Touch";  
            }
        }


        System.out.println("The provider is: " + provider);  

        scanner.close();  
    }
}
