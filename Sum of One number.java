

// user take the input we have to used the scanner class from java.util.Scanner
import java.util.Scanner;

class Main {
    
    
    static int sumOfnumber(int x){
        
        int totalSum = 0;
        for(int i = 1; i<=x; i++){
            totalSum += i;
        }
        
        return totalSum;
         
    }
    
    
     
    public static void main(String[] args) {
        
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // user would enter the value
        System.out.print("Enter an integer: ");
        
        // user input would get
        int userInput = scanner.nextInt();
        
        int result = sumOfnumber(userInput);
        
        System.out.println("Sum of Number: " + result);
         
    }
}