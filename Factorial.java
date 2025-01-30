import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        
        myMethod();
    }
    
    
    public static void myMethod() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a numer: ");
        
        // the number inputted will be stores as 'num'
        int num = scan.nextInt();
        
        //initialize the factorial number starting at the number they enter
        int factorial = num;
        
        //For loop to print each number counting down
        for (int i = num - 1; i > 0; i--){
            
        //i = every number starting from the number they enter to 0
        //so if user enters 5, i will equal 4 3 2 1 through iterations
        factorial *= i;
        }
        System.out.println("The factorial of "+num+" is "+factorial);
    }
    
    
}
