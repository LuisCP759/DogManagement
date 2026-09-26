/*--------------------------------------------
Program 5: MPLS Dog Management System
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
 */

import java.util.Scanner; //Importing Scanner Class

public class DogManagement { // class that contains your program 

    /*
     * Global Declaration for parallel arrays and Scanner Object
     */
    //DECLARING PARALEL ARRAYS OUTSIDE OF MAIN METHOD TO HOLD DOG DATA use the static keyword
    //DECLARING SCANNER OBJECT
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {  // main nothing here yet
        welcome();
        int choice = displayPrompt();
        System.out.println("You selected to enter a new dog");

    }

    //Welcome method that outputs introductory text explaining program
    public static void welcome() { // only function is to welcome display 
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    //Method to display prompt and return integer values
    public static int displayPrompt() {  // this should display all of the prompts from the user each time they pick a prompt 
        System.out.println("\nSelect a menu option:"); // menu first options show 
        String[] menuoptions = { // four local array of strings it hold the foru menu lables and exits only while display prompt runs 
            "Create a dog record",
            "Display dog record",
            "Update dog record",
            "Exit Program"
        };
        for (int i = 0; i < menuoptions.length; i++) { // loops prints each menu lable the array indexes start at 0 but adding 1 to 4 numbers 
            System.out.println((i + 1) + " )" + menuoptions[i]); //users should get the numbers next to the menu option

        }
        System.out.print("Enter selection here --> ");
        int selection = Integer.parseInt(scn.nextLine());  //scn.nextline reads wht the user types as text 
        // integer.parseInt() converts that text into integer 
        return selection; //local variable is saved and goes  back to the Displayprompt 
    }
}
