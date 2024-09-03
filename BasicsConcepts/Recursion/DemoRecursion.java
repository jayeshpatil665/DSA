import java.util.ArrayList;
import java.util.Vector;

public class DemoRecursion {

    public static int NnumbersSum(int N) {
        //Direct formula to do sum of 1 to N numbers
        //return (N*(N+1)/2);

        //your code goes here
        if(N==1)
            return 1;

        return N + (NnumbersSum(N-1));    
    }

    public static int factorial(int n) {
        if(n==1 || n==0)
            return 1;

        return n * factorial(n-1);
    }
    
    public static int addDigits(int num) {
        //your code goes here
        if(num<=0)
            return 0;
        
        int digit = num%10;
        return digit + addDigits(num/10);
    }

    public static int addDigitsTillSingleDigit(int num) {
        //your code goes here
        if(num<10)
            return num;
        
        int sum = 0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        
        return addDigits(sum);
    }

    //Sum of array elements
    public int sum(int[] nums,int i){
        if(i==0)
            return nums[i];

        return nums[i] + sum(nums,--i);    
    }

    public int arraySum(int[] nums) {
        //your code goes here
        return sum(nums,nums.length-1);
    }

    //-------------------------
    public static Vector<Character> reverseString(Vector<Character> s) {
        
        for(int i=0;i<s.size();i++){
            System.out.print(s.elementAt(i));
        }
        System.out.println();

        int startPrt = 0,endPrt=s.size()-1;
        while (startPrt<endPrt) {
            char chStart = s.elementAt(startPrt);
            s.setElementAt(s.elementAt(endPrt),startPrt);
            s.setElementAt(chStart, endPrt);
            startPrt++;
            endPrt--;
        }

        return s;
    }
    public static Vector<Character> reverseIt(Vector<Character> s,int startPtr,int endPtr){
        //terminating condition
        if(startPtr>endPtr)
            return s;

        //small task
        char bkpCh = s.elementAt(startPtr);
        s.setElementAt(s.elementAt(endPtr),startPtr);
        s.setElementAt(bkpCh,endPtr);

        s = reverseIt(s,++startPtr,--endPtr);
        return s;
    }

    //--------------------
    public String reverseString(char[] s,int startPtr,int endPtr){

        if(! (startPtr<endPtr))
            return new String(s);

        //small work
        char bkpCh = s[startPtr];
        s[startPtr] = s[endPtr];
        s[endPtr] = bkpCh;

        return reverseString(s,++startPtr,--endPtr);
    }


    public boolean palindromeCheck(String s) {
        //your code goes here
        int startPtr = 0;
        int endPtr = s.length()-1;
        String str = reverseString(s.toCharArray(),startPtr,endPtr);
        if(s.equals(str))
            return true;
        else
            return false;    
    }

    //----------------
    public boolean primeCheck(int num,int i){
        if(i > Math.sqrt(num)) //if(i == num)
            return true;

        if(num%i == 0)
            return false;

        return primeCheck(num,++i);    
    }
    public boolean checkPrime(int num) {
        
        if(num <= 1)
            return false;

        return primeCheck(num,2);
    }

    //-----------------
    public int[] reverseArr(int[] arr,int startPtr,int endPtr){

        if(! (startPtr<endPtr))
            return arr;

        //small work
        int bkpElement = arr[startPtr];
        arr[startPtr] = arr[endPtr];
        arr[endPtr] = bkpElement;

        return reverseArr(arr,++startPtr,--endPtr);
    }

    public int[] reverseArray(int[] nums) {
        
        return reverseArr(nums,0,nums.length-1);
    }

    //-------------
    public int fib(int n) {
        if(n==0) 
            return 0;
        if(n==1)
            return 1;    

        return fib(n-1) + fib(n-2);
    }
    //---------------
    public boolean checkSorted(ArrayList<Integer> nums,int i){

        if(i == nums.size())
            return true;

        if(nums.get(i) < nums.get(i-1))
            return false;

       return checkSorted(nums,++i);
    }

    public boolean isSorted(ArrayList<Integer> nums) {
       
       if(nums.size() <= 1)
        return true;

       return checkSorted(nums,1);
    }
}