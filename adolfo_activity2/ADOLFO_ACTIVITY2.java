/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adolfo_activity2;

/**
 *
 * @author ADOLFO_CPE113
 */
public class ADOLFO_ACTIVITY2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two student grade records
        LabGrade anna = new LabGrade("Anna", 80, 90);
        LabGrade beny = new LabGrade("Beny", 101, 85);

        // Display initial grades
        System.out.println("Anna's Grade: "
                + anna.getFinalGrade());
        System.out.println("Anna Passing: "
                + anna.isPassing());

        System.out.println("Beny's Grade: "
                + beny.getFinalGrade());
        System.out.println("Beny Passing: "
                + beny.isPassing());

        // Try updating Anna's scores with an invalid score
        System.out.println("Update Anna (95, 101): "
                + anna.updateScores(95, 101));
        System.out.println("Anna's Grade: "
                + anna.getFinalGrade());

        // Update Anna's scores
        System.out.println("Update Anna (74, 75): "
                + anna.updateScores(74, 75));
        System.out.println("Anna's Grade: "
                + anna.getFinalGrade());
        System.out.println("Anna Passing: "
                + anna.isPassing());

        // Update Anna's scores again
        System.out.println("Update Anna (75, 75): "
                + anna.updateScores(75, 75));
        System.out.println("Anna's Grade: "
                + anna.getFinalGrade());
        System.out.println("Anna Passing: "
                + anna.isPassing());

        // Check Beny's record again
        System.out.println("Beny's Final Grade: "
                + beny.getFinalGrade());
        System.out.println("Beny Passing: "
                + beny.isPassing());
    }
}
//QUESTION:
//WHY MUST YOU VALIDATE BOTH NEW SCORES BEFORE ASSIGNING EITHER ONE?
//ANSWER: Both new scores must be validated before assigning either 
//one to ensure that they are both correct and valid. This prevents 
//errors and inconsistent data because if one score is invalid, 
//neither should be assigned. This helps maintain the accuracy 
//and integrity of the system.