class HelloWorld {
    public static void main(String[] args){

        // java string way
        // basic question
        // how to find length
        // how to String Concatenation
        //Finding a Character in a String
        // More String Methods
        
        String name = "Shiv is very power energy";
        int length = name.length();
        System.out.println("length of the string: " + length);
        
        String word = "power";
        System.out.println(name.indexOf( word));
        
        
        // string String Concatenation
        String s1 = "Ram";
        String s2 = "Sita";
        String con = s1 + s1;
        System.out.println("string String Concatenation " + con);
        
        
        // string lowercase and uppercase convert
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
    }
}