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
    // we need to have variables where we will stored the dogs information when user input is given 
    //The class-level arrays are the storage: they keep those details after the method finishes, 
    //so the get and update methods can use them later.
    static int[] dogID = new int[12];
    static String[] dogname = new String[12];
    static Double[] dogweight = new Double[12];
    static int[] dogage = new int[12];
    static int dogcount = 0;
    int selection = 0;

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {  // main nothing here yet
        welcome();
        int choice = displayPrompt();
        if (choice == 1) {
            Attendantrecording();
        }

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
        for (int row = 0; row < menuoptions.length; row++) { // increase row up to 3 
            System.out.println((row + 1) + ")" + menuoptions[row]);

        }
        int selection = 0;
        while (selection < 1 || selection > menuoptions.length) {
            System.out.print("Enter selection here --> ");
            selection = Integer.parseInt(scn.nextLine());  //scn.nextline reads wht the user types as text 
            // integer.parseInt() converts that text into integer 

            if (selection < 1 || selection > menuoptions.length) {
                System.out.println("Invalid menu option:" + selection);
            }
        }
        return selection; //local variable is saved and goes  back to the Displayprompt    

    }

    public static void Attendantrecording() { // first creationg of the record for each array 
        System.out.println("Please filled out form:");  // user just needs to go in and filled out dog ID information 

        if (dogcount >= dogID.length) { // keep track of the amount of dogs we want to add 
            System.out.println("Dog record storage is full");   // were making sure we have space in storage to keep adding dog information 
        } else { // else will always run as logn as memory is never full 
            System.out.print("Enter do dog ID :");
            int entereddogID = Integer.parseInt(scn.nextLine());

            System.out.print("Enter dog name");   // storing dog information 
            String enterdogname = (scn.nextLine());

            System.out.print("Enter dog age:");
            int enterdogage = Integer.parseInt(scn.nextLine());

            System.out.print("Enter dog weight:");
            Double enterdogweight = Double.parseDouble(scn.nextLine());

            // we need to indentify the index of each input to get the right array when user comes back to get information
            dogID[dogcount] = entereddogID; // this is adding to the array each time we make a record 
            dogname[dogcount] = enterdogname;
            dogweight[dogcount] = enterdogweight;
            dogage[dogcount] = enterdogage;

            dogcount++;

        }
    }

    public static int updaterecord() {
        System.out.println("");
        for (int index = 0; < dogCount; index++) {
            if (dogIDs[index] == idtofind) {
                return;
            }
        }
        System.out.println("No dog ID found")
    }

    public static int getrecord() {
        if (menuoption == 2) {
            for (dogID ==                )

        }

    }

    public static int exitprogram() {
        if (menuoption == 4) {

        }
    }
}
