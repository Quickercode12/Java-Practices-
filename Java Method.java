// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// how to used java method , java method is block of code , block of code means function
// let's discuss about java function 
    
public class Main {
        
    // without passing argument 
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    static void userName(String name){
        System.out.println("Love of name : " + name);
    }
    
    static void sumNumber(int x, int y){
        System.out.println("Sum of tow number: " + (x + y));
    }
    
    static int sumOf(int x, int y){
        return (x+y);
    }
    
    static int recursionsSum(int x) {
        if (x == 1) {
            return x;
        }

    return x + recursionsSum(x - 1);
}


    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        
        // by the argument pass 
        userName("Shiv");
        
        // two  sum
        sumNumber(2,9);
        
        
        // return function declaration 
        int result = sumOf(49,9);
        System.out.println("Sum of two number by the return : " + result);
        
        
        // recursion sum 
        int sum = recursionsSum(5);
        System.out.println("Sum of two number by the return : " + sum);
        
        
        // method overloading ?
        // method overloading means call the funcation same name but diff parameters 
        
    }
    
    
    
    
}