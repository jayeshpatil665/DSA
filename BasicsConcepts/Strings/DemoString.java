import java.util.Arrays;
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

    public static void sortString(String str){
        //move characters to start and digits to end
        System.out.println("You have entered str : "+str);

        String charString = "";
        String digitString = "";
        for(int i=0;i<str.length();i++){

            try {
                Integer.parseInt(""+str.charAt(i));
                digitString = digitString.concat(""+str.charAt(i));
            } catch (java.lang.NumberFormatException e) {
              // System.out.println(e.getMessage());

              charString = charString.concat(""+str.charAt(i));
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("output charString : "+charString);
        System.out.println("output digitString : "+digitString);
        System.out.println(charString+digitString);
    }


    public String shiftByOne(String str){
        char ch = str.charAt(str.length()-1);

        //System.out.println(str.charAt(str.length()-1));
        //System.out.println(str.substring(0,str.length()-1));
        String output = ch +""+str.substring(0,str.length()-1);
       return  output;
   }

   public boolean rotateString(String s, String goal) {

       if(s.equals(goal))
           return true;

       if(s.length()!= goal.length())
           return false;    

       String str = s+s; //s.concat(s);
       if(str.contains(goal))
               return true;

      /* String str = s;
       for(int i=0;i<s.length()-1;i++){
           str = shiftByOne(str);
           //System.out.println(str);

           if(str.equals(goal))
               return true;
       }*/

       return false;
   }

    public boolean anagramStrings(String s, String t) {
        
        if(s.length() != t.length())
            return false;

        char arrS[] = s.toCharArray();
        char arrT[] = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

       /* String strS = new String(arrS);
        String strT = new String(arrT);
        return (strS.equals(strT))? true : false;*/

        return Arrays.equals(arrS,arrT);
    }

}
