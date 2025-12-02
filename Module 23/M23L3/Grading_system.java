import java.util.*;

class Main {
  public static void main(String[] args) {
    int sum = 0;                
    String result;              
    Scanner sc = new Scanner(System.in);

    // Asking how many subjects
    System.out.println("Enter the number of Subjects: ");
    int noOfSubjects = sc.nextInt();

    // Creating an array to hold marks of each subject
    int marks[] = new int[noOfSubjects]; 

    // Taking input of marks
    System.out.println("Enter the marks of " + noOfSubjects + " Subjects. Press Enter after each mark:");
    for (int i = 0; i < noOfSubjects; i++) {
      marks[i] = sc.nextInt();
    }

    // Calculating total (sum of all marks)
    for (int j = 0; j < noOfSubjects; j++) {
      sum = sum + marks[j];
    }

    // Calculating percentage
    int percentage = sum / noOfSubjects;  

    System.out.println("Percentage: " + percentage);

    // Grading system
    if (percentage >= 95) {
      result = "You scored O grade. Excellent Work!";
    } else if (percentage >= 90) {
      result = "You scored A+. Outstanding!";
    } else if (percentage >= 80) {
      result = "You scored A. Very Good!";
    } else if (percentage >= 70) {
      result = "You scored B. Good Job!";
    } else if (percentage >= 60) {
      result = "You scored C. Work Harder!";
    } else if (percentage >= 50) {
      result = "You scored D. You Passed.";
    } else {
      result = "Fail. Better Luck Next Time!";
    }

    // Printing result
    System.out.println(result);
  }
}
