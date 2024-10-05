

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        // how to genrate random number by java
        
        // user input process
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to generate random number: ");
        int userInput = scanner.nextInt();
        
        double random = Math.random();
        
        // user range
        double ran = (Math.random() * userInput);
        System.out.println(ran);
        
    }
}