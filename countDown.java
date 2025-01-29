import java.util.Scanner;

class countDown {
    public static void main(String[] args) {
        
        //Calling the function below
        validateAndCountdown();
    
    }


//New function to validate and countdown
public static void validateAndCountdown() {
    
    // Try and catch statements to ensure they enter a number
    try {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a numer: ");
        
        // the number inputted will be stores as 'num'
        int num = scan.nextInt();
        
        
        //For loop to print each number counting down
        for (int i = num - 1; i > 0; i--){
        System.out.println(i);
        }
    
    }
    
    //Catch statement in case user inputs a non int
    catch (Exception e) {
        System.out.println("NOT A NUM");
    }
    
}
}
