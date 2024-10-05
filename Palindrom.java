import java.util.Scanner;
import java.util.Vector;

class Main {

    // Palin
    static Boolean Palin(int x){
        
        int palin = x;
        int temp = 0;
        
        while(x != 0){
            
            int digit = x % 10;
            temp = temp*10 + digit;
            x = x /10;
        
        }
        
        return temp == palin ? true : false;
        
    }
    
    public static void main(String[] args) {

        // Palindrom in java
        
        // user Input take Process
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to check Palindrom: ");
        int userInput = scanner.nextInt();
        
        Boolean result = Palin(userInput);

        if(result == true){
            System.out.println("Your number is Palindrom");
        }
        
        else{
            System.out.println("Your number is not palindrom");
        }
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
