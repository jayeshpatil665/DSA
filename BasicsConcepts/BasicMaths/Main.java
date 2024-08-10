public class Main {

    public static void main(String[] args) {
        
        int count = BasicMaths.countDigitsOfNumber(-1234);
        System.out.println("1234 contains "+count+" digits");

        int digits = (int) Math.log10(1234);
        System.out.println("digit count is : "+(1+digits));

        count = BasicMaths.countOddDigits(15);
        System.out.println("Odd digits are : "+count);

        int revNumber = BasicMaths.reverseNumber(1234);
        System.out.println("Numbber : "+1234+" | ReverseNumber : "+revNumber);

        boolean isPalindrome = BasicMaths.isPalindrome(1221);
        System.out.println("Number 1221 is palindrome "+isPalindrome);


        int digit = BasicMaths.largestDigit(12534);
        System.out.println("Largest digit in 12534 is : "+digit);

        int fact = BasicMaths.factorial(3);
        System.out.println("Factorial of 3 is "+fact);

        int len =  String.valueOf(1234).length();
        System.out.println("Length is "+len);

        System.out.println(Math.pow(5, 3));

        boolean armstrong = BasicMaths.isArmstrong(370);
        System.out.println("Number 370 is 💪ArmStrong "+armstrong);

        boolean isPerfect = BasicMaths.isPerfectBrute(6);
        System.out.println("Brute : Number 6 is perfect "+isPerfect); //1 + 2 + 3 = 6.

        isPerfect = BasicMaths.isPerfectOptimized(6);
        System.out.println("Optimized : Number 6 is perfect "+isPerfect); //1 + 2 + 3 = 6.

        boolean isPrime = BasicMaths.isPrimeBrute(9);
        System.out.println("Number 9 is prime "+isPrime);

        isPrime = BasicMaths.isPrimeOptimized(9);
        System.out.println("Number 9 is prime "+isPrime);

        int primeCount = BasicMaths.primeUptoN(10);
        System.out.println("Primes upto 10 are "+primeCount);
    }
}