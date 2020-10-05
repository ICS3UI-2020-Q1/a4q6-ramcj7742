import java.util.Scanner;
/**
 * Checks if user number is prime or not
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner (System.in);

    // Gets user number
    System.out.println("Which number would you like to check?");
    int userNum = input.nextInt();

    //creates variable to count up to userNum, check if number is divisable by the count num, and counts amount of times the number is divided
    int count = 0;
    int checkPrime = 0;
    int divideCount = 0;

    // creates loop that checks if number is prime
    while(count < userNum){
      count = count + 1;
      //checks if number can divide by the current count num
      checkPrime = userNum % count;
      //adds to divide count if remainder is 0, sets division checker to 0
      if(checkPrime == 0){
        divideCount = divideCount + 1;
        checkPrime = 0;
      }else checkPrime = 0;
    }
    //displays to user the results based on how amny times the remainder is 0
    if(divideCount > 2){
      System.out.println(userNum + " is not a prime number");
    }else if(divideCount <= 2){
      System.out.println(userNum + " is a prime number");
    }
  }
}
