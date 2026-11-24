/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adolfo_activity1;

/**
 *
 * @author ADOLFO_CPE113
 */
public class ADOLFO_ACTIVITY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create two student accounts
        PrintAccount miya = new PrintAccount("Miya", 10);
        PrintAccount luisa = new PrintAccount("Luisa", -4);

        // Display starting credits
        System.out.println("Miya's Credits: " + miya.getCredits());
        System.out.println("Luisa's Credits: " + luisa.getCredits());

        // Miya prints 4 pages
        System.out.println("Miya prints 4 pages: "
                + miya.printPages(4));
        System.out.println("Miya's Credits: " + miya.getCredits());

        // Miya tries to print 7 pages
        System.out.println("Miya prints 7 pages: "
                + miya.printPages(7));
        System.out.println("Miya's Credits: " + miya.getCredits());

        // Miya tries to add negative credits
        System.out.println("Miya adds -3 credits: "
                + miya.addCredits(-3));
        System.out.println("Miya's Credits: " + miya.getCredits());

        // Miya adds 4 credits
        System.out.println("Miya adds 4 credits: "
                + miya.addCredits(4));

        // Display final credits
        System.out.println("Miya's Final Credits: "
                + miya.getCredits());
        System.out.println("Luisa's Final Credits: "
                + luisa.getCredits());
    }
}
//Prompt used: “Don’t give me the code directly. What should I consider 
//before updating the remaining printing credits?”

//You should check if the user has enough printing credits, whether the requested number of pages 
//is valid, and if the deduction will not result in a negative balance. 
//Also, make sure that the credits are updated only after all necessary conditions are satisfied.

//What you accepted or rejected from the reply, and how you checked it.
//What I Accepted:

//Checking if the user has enough printing credits before deducting.

//Making sure the requested number of pages is valid.

//Ensuring that the remaining credits will not become negative.

//Updating the credits only after all conditions are satisfied.

//What I Rejected:

//I did not reject any suggestions because all the conditions were relevant to the printing credit deduction process.

//How I Checked It:
//I reviewed each suggestion and compared it with the expected printing credit process. 
//I checked whether the conditions could 
//prevent invalid deductions, negative balances, 
//and incorrect credit updates. I accepted the suggestions 
//because they help ensure accurate and reliable credit management.