//   IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
        import java.util.List;
        import java.util.ArrayList;
        import java.util.Arrays;

// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class SubStringsLessKDist
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> subStringsLessKDist(String inputString, int num)
    {
        List<String> result = new ArrayList();
        int size = inputString.length();

        int[] characters = new int[26];
        for(int i=0;i<size-num+1;i++) {
            String sbstr = inputString.substring(i,i+num);
            int distinctCharNumber = 0;
            Arrays.fill(characters,0);
            for(int j=0;j<num;j++) { // look for substrings
                if( characters[sbstr.charAt(j) - 'a'] == 0) { // distinct
                    distinctCharNumber++;
                }
                characters[sbstr.charAt(j) - 'a']++;
            }
            if(distinctCharNumber == (num - 1)) {
                result.add(sbstr);
            }
        }
        return result;
    }
    // METHOD SIGNATURE ENDS
}
