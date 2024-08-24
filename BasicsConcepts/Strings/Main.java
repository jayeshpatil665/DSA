import java.util.Vector;

public class Main {

     public static void main(String[] args) {
        
        //Reverse a String
        Vector<Character> vector = new Vector<>();
        vector.add('h');
        vector.add('e');
        vector.add('l');
        vector.add('l');
        vector.add('o');

        Vector<Character> reversedStr = DemoString.reverseString(vector);

        for (char c : reversedStr) {
            System.out.print(c);
        }
        System.out.println();

        //chack Palindrom
        String str = "aba";  

        if (DemoString.palindromeCheck(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        System.out.println();

     }
}