
/**
 * class ExamTabel - Heb vooral tijd in de andere oefening gestoken, 
 * had meer tijd nodig voor deze
 *
 * @author Ward
 * @version (versie 1)
 */
import java.util.Random;

public class ExamTabel
{
    private int[] reeks; 
    private int[] reeksTwee;
    private Random randomGetal;
    private String text;
    /**
     * Constructor voor objects van class ExamTabel
     */
    public ExamTabel(int hoeveel)
    {
        reeks = new int[hoeveel];
        
        for (int i = 0; i<hoeveel; i++) {
            int index = (randomGetal.nextInt(11)) + 10;
            reeks[i] = index;
        
        }
        
        reeksTwee = new int[hoeveel];
        for (int i = 0; i<hoeveel; i++) {
            int index = (randomGetal.nextInt(11)) + 10;
            reeksTwee[i] = index;
        
        }
    }
    
    
    public String toString()
    {
        String text = "";
        
        for (int i = 0; i< reeks.length; i++) {
            
            text += reeks[i] + "\n";
        }
        
        for (int i = reeksTwee.length -1; i>=0; i--) {
            
            ;
        }
        
        return text;
    }
}
