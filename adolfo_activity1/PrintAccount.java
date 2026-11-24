/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adolfo_activity1;

/**
 *
 * @author ADOLFO_CPE113
 */
public class PrintAccount {
    // Private variables to store student information

    private String studentName;
    private int credits;

    // Constructor to initialize the account
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        // If credits are negative, start with zero
        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    // Method to add credits
    public boolean addCredits(int amount) {

        // Only positive amounts are accepted
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    // Method to print pages and deduct credits
    public boolean printPages(int pages) {

        // Check if pages are valid and enough credits are available
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    // Getter method to return the current credits
    public int getCredits() {
        return this.credits;
    }
}
