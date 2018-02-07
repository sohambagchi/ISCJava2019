
/**
 * Write a description of class Switch_class here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Switch_class
{
    // instance variables - replace the example below with your own
    private int x;


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod()
    {
        int a = 27;
        int b = 18;
        int c = 3;
        String s = "The greatest number is ";
        
        if(a>b){
            if(a>c){
            System.out.println(s + a);
            }
            else {
            System.out.println(s + c);
            }
            }
            else{
            if(b>c){
            System.out.println(s + b);
            }
            else {
            System.out.println(s + c);
            }}
        }
    }