public class BasicMaths {
    
    public static int countDigitsOfNumber(int num){
        if(num==0)
            return 1;

        if(num<0)
            num = Math.abs(num);
        int count = 0;

        while (num>0) {
            num = num/10;
            count++;
        }
        return count;
    }

    public static int countOddDigits(int num){
        int count = 0;

        while (num>0) {
            int digit = num%10;
            num = num/10;

            if(digit%2 != 0)
                count++;
        }

        return count;
    }

    public static int reverseNumber(int n) {
        int revNum = 0;

        if(n==0)
            return revNum;

        while(n>0){
            int digit = n%10;
            revNum = revNum*10 + digit;
            n = n/10;
        }

        return revNum;
    }

    public static boolean isPalindrome(int n) {
        int revNum = 0;
        int ogNumber = n;


        while(ogNumber>0){
            int digit = ogNumber%10;
            revNum = revNum*10 + digit;
            ogNumber = ogNumber/10;
        } 

        return (n==revNum?true:false);
    }

    public static int largestDigit(int n) {
        int largestDigit = 0;

        if(n==0)
            return largestDigit;

        while(n>0){
            int digit = n%10;

            if(digit>largestDigit)
                largestDigit = digit;

            n = n/10;
        }

        return largestDigit;
    }

    public static int factorial(int n) {
        int fact = 1;

        if(n==1 || n==0)
            return fact;

        int number = n;

        while(number>1){
            fact = fact * number;
            number--;
        }
        return fact;
    }

    public static boolean isArmstrong(int n) {
        int digitsCount = (int) Math.log10(n)+1; //String.valueOf(n).length();
        long sumOfNumberCube = 0;
        int ogNumber = n;

        while(ogNumber>0){
            int digit = ogNumber%10;
            sumOfNumberCube += (int) Math.pow(digit,digitsCount);
            System.out.println("digit : "+digit+"^"+digitsCount);
            ogNumber = ogNumber/10;
        }
        
        return (sumOfNumberCube == n?true:false);
    }

    public static boolean isPerfectBrute(int n) {
        int divisorsSum = 0;

        for(int i=1;i<n;i++){
            if(n%i ==0)
                divisorsSum+=i;
        }
        return (divisorsSum==n?true:false);
    }

    public static boolean isPerfectOptimized(int n) {
        int divisorsSum = 1;

        for(int i=2;i<=Math.sqrt(n);i++){ //  Math.sqrt(n) is similar to i*i<=n
            if(n%i ==0){
                divisorsSum+=i;
                if(i != (n/i) )
                    divisorsSum+=(n/i);
            }
        }
        return (divisorsSum==n?true:false);
    }

    public static boolean isPrimeBrute(int n) {
        for(int i=2;i<n;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){ //  Math.sqrt(n) is similar to i*i<=n
            if(n%i == 0)
                return false;
        }
        return true;
    }

    public static int primeUptoN(int n) {
        int count = 0;
        for(int i=2;i<=n;i++){
            if(isPrimeOptimized(i))
                count++;
        }
        return count;
    }
    
    public static int GCD(int n1, int n2) {
        int minimum = (n1<n2?n1:n2);
        int gcd = 1;
        for(int i=minimum;i>1;i--){
            if(n1%i == 0 && n2%i == 0)
                return i;
        }
        return gcd;
    }

    public static int GCDoptimized(int n1, int n2) { // Time complexity = O(log(Min(n1,n2)))
        //solved with euclidian algorithm
        //System.out.println(Math.min(n1,n2));
        while(n1 != 0 && n2 != 0){
            if(n1>n2)
                n1 = n1%n2;
            else
                n2 = n2%n1;
                
            //System.out.println("n1 : "+n1+" | n2 : "+n2);        
        }
        //System.out.println("GCD is : "+Math.max(n1,n2));
        return(Math.max(n1, n2));
    }

    public static int LCM(int n1, int n2) { // Time complexity = O(n1 * n2)
        int i=1;
        int maximum = Math.max(n1,n2);

        do{
            int multiple = i * maximum;
            if(multiple%n1== 0 && multiple%n2 == 0)
                return multiple;

            i++;    
        }while(true);
    }

    public static int LCMoptimized(int n1, int n2) {
        //concept of GCD is used here
        return (n1*n2)/GCD(n1,n2);  //Time complexity = O(log(Min(n1,n2)))
    } 

}
