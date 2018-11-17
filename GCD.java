// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        int res=arr[0], gcd = 1;
         for(int i=1;i<arr.length;i++) {
             if(res<arr[i])
                res = arr[i];
         }
        
        for(int j=1; j<=res ;j++) {
            boolean flag = true;
            for(int i=0;i<arr.length;i++) {
                if(arr[i] % j == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag && (j > gcd)) {
                gcd = j;
                
            }
        }
        return gcd;
    }
    
}
