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
    }
}