class HelloWorld {
    public static void main(String[] args){

        // Math in java
        int x = 10;
        int y = 104;
        // int ma = Math.max(x, y);
        // find max number
        System.out.println("Max number in x and y : " + Math.max(x, y));
        
        
        int x1 = 10;
        int y1 = 104;
        // int ma = Math.min(x, y);
        // find min number
        System.out.println("Min number in x and y : " + Math.min(x1,y1));
        
        
        System.out.println("always positive number : " + Math.abs(-4.7));
        
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println("random number is :" + randomNum);
    }
}