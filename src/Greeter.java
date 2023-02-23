/**
 * Complete the TODO items below.
 * <p>
 * ALSO answer the questions in the comments below.  (You may add your answers as further comments.)
 *
 */

//import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Scanner;

public class Greeter {

    private static String GetNameFromGui() {
        String name = JOptionPane.showInputDialog("Tell me your name good sir or maam, or xi or xer. Idk man this generation is pretty wild");
        System.out.println(name);
        return name;
    }



    // TODO: write a printName method that prints the messages "Hello, {name}!" to the console

    public static void PrintName(String name) {
        System.out.println("Hello " + name+". Good to know that you exist. I would like to reach out to you about your car's extended warranty.");
    }


    public static void main(String[] args) {
        String name = GetNameFromGui();
        PrintName(name);
    }
}



        //TODO: call the getNameFromGui method and store the result in a variable
    //public class getNameFromGui(){
//forget this stuff below this line this is just my trial and error
     //public static void main(String[] args) {
        //getNameFromGui();
         //public static void main(String[] args){
         //System.out.println("What is your name");
         //getNameFromGui();
         //System.out.println("Hello" + name);
         //JOptionPane.showInputDialog
         //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
         //System.out.println("What is your name");
         //String Name = myObj.nextLine();  // Read user input
         //System.out.println("Hello " + Name + "!");
//this scanner command is lame bc it was the first solution i found, so I did not use it












        // TODO: call the printName function with the variable you created above as an argument



