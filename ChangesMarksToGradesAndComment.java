
/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChangesMarksToGradesAndComment
{
    // instance variables - replace the example below with your own
    private int x;
    public int score;
    /**
     * Constructor for objects of class q1
     */
    public ChangesMarksToGradesAndComment()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        char grade;
        if (score == 100) {
            grade = 'A';
            System.out.println("Superb");
        }
        else if (score >= 90) {
            grade = 'A';
            System.out.println("Excellent");
        }
        else if (score >= 80) {
            grade = 'B';
            System.out.println("Very Good");
        }
        else if (score >= 70) {
            grade = 'C';
            System.out.println("Good");
        }
        else if (score >= 60)
            grade = 'D';
        else
        grade = 'E';
    }
}
