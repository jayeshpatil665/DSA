import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};

        ArraysDemo.printArray(arr);

        int largestElement = ArraysDemo.largestElement(arr);
        System.out.println("Largest element is : "+largestElement);

        ArraysDemo.largestAndSecondLargestElement(arr);

        Arrays.sort(arr); // sorts array in O(n log n)
        System.out.println("Array is sorted : "+ArraysDemo.isArraySorted(arr));

        System.out.println("Unque Element Array Length is : "+ArraysDemo.removeDuplicates(arr));

        ArraysDemo.printArray(arr);
        System.out.println("\nLeft Rotate array by one : ");
        ArraysDemo.leftRotateByOnePlace(arr);
        ArraysDemo.printArray(arr);


        ArraysDemo.leftRotateByNplaces(arr, 3);
        ArraysDemo.printArray(arr);

        //Copy element sof array one into array two
        int arrOne[] = {10,20,30,40,50,60,70,80,90,100};
        int arrTwo[] = Arrays.copyOf(arrOne,20);
        
        System.out.println("Second Array length is : "+arrTwo.length);
        for(int element : arrTwo){
            System.out.println(element);
        }

        System.out.println("Print all divisors of int n");
        
        for(int element : ArraysDemo.divisors(8)){
            System.out.print(element+", ");
        }

        boolean isSorted = ArraysDemo.isArraySorted(arrOne);
        System.out.println("Array one is sorted : "+isSorted);
    }
}