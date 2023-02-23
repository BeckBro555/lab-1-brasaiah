/**
 * Add your solution to Practice Exercise 1.4 in this file
 *
 * ALSO answer the questions in the comments below.  (You may add your answers as further comments.)
 *
 * Write a program that prints the balance of an account after the first, second, and third year.
 * The account has an initial balance of $1,000 and earns 5 percent interest per year.
 *
 */

// QUESTION 1: Why does the program fail to run if you rename the class to something other than Balance?
public class Balance {

    // QUESTION 2: Why must the main method be declared as public static void? (Explain each keyword specifically.)
    public static void main(String[] args) {
    System.out.println("Question 1: It fails due to the fact that it must be the same name as the file, in this case, Balance");
    //Java main()
    System.out.println("Question 2: The main() needs to be static, in order for the compiler to call it without");
    System.out.print("the creation of an object before the creation of an object of the class");

        // QUESTION 3: Why must all variables you declare be declared with a type?
        System.out.println("Question 3: A variable's type will determine the actions you can perform on it, as well as the values that it could have");
    }
}