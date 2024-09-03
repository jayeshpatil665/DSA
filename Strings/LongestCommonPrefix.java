import java.util.Arrays;

public class LongestCommonPrefix{

    /*
    Time Complexity:O(S * N) where S is the length of the smallest string and N is the number of strings
    Space Complexity:O(1) since we are using a constant amount of space for variables
    */
    public static String longestCommonPrefix_Brute(String[] strArr) {
        int smallestStringSize = Integer.MAX_VALUE;

        for(String str : strArr)
            smallestStringSize = Math.min(str.length(),smallestStringSize);

        String baseString = strArr[0];
        int commonTillIndex = 1;
        for(int i=0;i<smallestStringSize;i++){
            for(String str : strArr){
              boolean ok = str.startsWith(baseString.substring(0,commonTillIndex));

              if(! ok){
                if(commonTillIndex-1 > 0)
                    return baseString.substring(0,commonTillIndex-1);
                else
                    return "";    
              }
            }

            commonTillIndex++;
        }  

        if(commonTillIndex-1 > 0)
            return baseString.substring(0,commonTillIndex-1);
        else
            return "";  
    }

    /*
    Time Complexity:O(n log n + m), where n is the number of strings and m is the length of the longest string.
    Space Complexity:O(1), constant space used for variables.
    */
    public static String longestCommonPrefix_Better(String[] strArr) {

        Arrays.sort(strArr);
        
        String baseString = strArr[0];
        String lastString = strArr[strArr.length-1];
        
        int smallestStringSize = Math.min(baseString.length(), lastString.length()-1);
        int commonTillIndex = 1;
       
        for(int i=0;i<smallestStringSize;i++){
            boolean ok = lastString.startsWith(baseString.substring(0,commonTillIndex));
            if(! ok)
                break;
            
            commonTillIndex++;
        }  

        if(commonTillIndex-1 > 0)
            return baseString.substring(0,commonTillIndex-1);
        else
            return "";  
    }

    /*
    Time Complexity:O(n log n + m) where n is the number of strings and m is the length of the shortest string
    Space Complexity:O(m) where m is the length of the longest common prefix stored in StringBuilder
    */
    public static String longestCommonPrefix_Optimal(String[] strArr) {

        Arrays.sort(strArr);
        
        String baseString = strArr[0];
        String lastString = strArr[strArr.length-1];
        
        int smallestStringSize = Math.min(baseString.length(), lastString.length()-1);

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<smallestStringSize;i++){
            if(baseString.charAt(i) != lastString.charAt(i))
                return sb.toString();   

           sb.append(baseString.charAt(i));
        }  
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String result = longestCommonPrefix_Optimal(input);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}