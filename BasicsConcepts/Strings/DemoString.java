import java.util.Vector;

public class DemoString {
    
        public static Vector<Character> reverseString(Vector<Character> s) {
        int startPrt = 0;
        int endPrt = s.size()-1;

        while(startPrt<endPrt){
            char startChar = s.elementAt(startPrt); // bkp first character
            s.setElementAt(s.elementAt(endPrt),startPrt); //set last character to first index
            s.setElementAt(startChar,endPrt); // set bkpFirst character to last index

            startPrt++;
            endPrt--;
        }

        return s;
    }

    public static boolean palindromeCheck(String s) {
        int startPrt = 0;
        int endPtr = s.length()-1;

        while(startPrt<endPtr){
            if(s.charAt(startPrt) != s.charAt(endPtr))
                return false;

            startPrt++;
            endPtr--;
        }
        return true;
    }

}
