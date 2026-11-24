/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adolfo_activity2;

/**
 *
 * @author ADOLFO_CPE113
 */
public class LabGrade {
    // Private variables for student information

    private String studentName;
    private int quizScore;
    private int labScore;

    // Constructor
    public LabGrade(String studentName, int quizScore, int labScore) {

        this.studentName = studentName;

        // TODO:
        // Validate the quiz score and lab score separately.
        // Valid scores must be from 0 to 100.
        // Replace each invalid score with zero.
    }

    // Method to update both scores
    public boolean updateScores(int quizScore, int labScore) {

        // TODO:
        // First check if BOTH scores are valid.
        // If either score is invalid, return false.
        // Do not change the old scores.
        // If both are valid, update both scores and return true.
        return false;
    }

    // Method to calculate the final grade
    public double getFinalGrade() {

        // TODO:
        // Calculate 40% of the quiz score
        // and 60% of the lab score.
        // Return the computed grade.
        return 0.0;
    }

    // Method to check if the student is passing
    public boolean isPassing() {

        // TODO:
        // Use getFinalGrade().
        // A grade of 75.0 or higher is passing.
        return false;
    }

    // Getter for student name
    public String getStudentName() {
        return this.studentName;
    }
}
