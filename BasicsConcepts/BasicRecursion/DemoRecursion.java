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
}