// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.*;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class EightCellCompete
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        List<Integer> result = new ArrayList<>();
        
        int[] allStates = new int[10];
        int[] resStates = new int[10];
        allStates[0] = 0; // first inactive cell
        allStates[9] = 0; // last inactive cell
        for(int j=0;j<8;j++) {
            allStates[j+1] = states[j];
        }
        
        for(int i=0;i<days;i++) {
            for(int j=1;j<9;j++) {
                resStates[j] = allStates[j-1] ^ allStates[j+1];
            }
            
            for(int j=1;j<9;j++) {
                allStates[j] = resStates[j];
            }
            //allStates = resStates;
            allStates[0] = 0; // first inactive cell
            allStates[9] = 0; // last inactive cell
        }
        
        
        for(int j=1;j<9;j++) {
            result.add(allStates[j]);
        }
        
        return result;
    }
  // METHOD SIGNATURE ENDS
}
