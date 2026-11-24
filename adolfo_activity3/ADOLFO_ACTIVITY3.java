/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adolfo_activity3;

/**
 *
 * @author ADOLFO_CPE113
 */
public class ADOLFO_ACTIVITY3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two wallets
        CampusWallet elaine = new CampusWallet("Elaine", 100);
        CampusWallet ivan = new CampusWallet("Ivan");

        // Display starting balances
        System.out.println("Elaine's Balance: "
                + elaine.getBalance());
        System.out.println("Ivan's Balance: "
                + ivan.getBalance());

        // Elaine transfers 35 credits to Ben
        System.out.println("Transfer 35: "
                + elaine.transferTo(ivan, 35));

        System.out.println("Elaine: " + elaine.getBalance());
        System.out.println("Ivan: " + ivan.getBalance());

        // Elaine tries to transfer 70 credits
        System.out.println("Transfer 70: "
                + elaine.transferTo(ivan, 70));

        // Elaine tries to transfer to herself
        System.out.println("Transfer to self: "
                + elaine.transferTo(elaine, 10));

        // Ivan deposits 15 credits
        System.out.println("Ivan deposits 15: "
                + ivan.deposit(15));

        // Elaine transfers all remaining credits
        System.out.println("Transfer 65: "
                + elaine.transferTo(ivan, 65));

        // Display final balances
        System.out.println("Final Elaine Balance: "
                + elaine.getBalance());
        System.out.println("Final Ivan Balance: "
                + ivan.getBalance());

        // Additional tests required by the handout
        System.out.println("Transfer zero: "
                + elaine.transferTo(ivan, 0));

        System.out.println("Transfer to null: "
                + elaine.transferTo(null, 10));
    }
}
//Activity 3, Added Test 1 (Zero-credit transfer): 
//The transfer should return false because the transfer 
//amount must be greater than zero. Elaine's balance should remain 0, 
//and Ivan's balance should remain 115.

//Activity 3, Added Test 2 (Transfer to null): 
//The transfer should return false because a null recipient is not 
//allowed. Both Elaine's balance (0) and Ivan's balance (115) should remain unchanged.