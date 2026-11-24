/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adolfo_activity3;

/**
 *
 * @author ADOLFO_CPE113
 */
public class CampusWallet {
    // Private variables

    private String owner;
    private int balance;

    // Two-parameter constructor
    public CampusWallet(String owner, int balance) {

        this.owner = owner;

        // TODO:
        // Check if the starting balance is negative.
        // If negative, initialize it to zero.
    }

    // One-parameter constructor
    public CampusWallet(String owner) {

        // TODO:
        // Call the two-parameter constructor using this().
        // The starting balance should be zero.
    }

    // Method to deposit credits
    public boolean deposit(int amount) {

        // TODO:
        // Accept only positive amounts.
        // Add the amount to the balance.
        // Return true if successful.
        return false;
    }

    // Method to transfer credits to another wallet
    public boolean transferTo(CampusWallet recipient, int amount) {

        // TODO:
        // Reject a null recipient.
        // Reject the same wallet as the recipient.
        // Reject zero or negative amounts.
        // Check if the sender has enough balance.
        // If all conditions are valid:
        // Deduct from sender and add to recipient.
        // Return true.
        // Otherwise, return false.
        return false;
    }

    // Getter method for balance
    public int getBalance() {
        return this.balance;
    }

    // Getter method for owner
    public String getOwner() {
        return this.owner;
    }
}
