import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    
    public static void printArray(int arr[]){
        /*for(int element : arr){
            System.out.print(element+" ,");
        }*/
        System.out.println(Arrays.toString(arr));
    }

    public static int largestElement(int arr[]){
        int largest = Integer.MIN_VALUE;

        /*Arrays.sort(arr); //Sort array  o(n log n)
        largest =  arr[arr.length-1];*/

        for(int element : arr){ // O(n)
            if(element>largest)
                largest = element;
        }
        return largest;
    }

    public static void largestAndSecondLargestElement(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int element : arr){ // O(n)
            if(element>largest){
                secondLargest = largest;
                largest = element;
            }
            else if(element<largest && element>secondLargest){
                secondLargest = element;
            }
        }

        System.out.println("Largest Element : "+largest+" | Second Largest Element : "+secondLargest);
    }

    public static boolean isArraySorted(int arr[]){

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
            }
            else{
                return false;
            }
        }

        return true;
    }
    
    public static int removeDuplicates(int[] arr) {
        //Do not allocate extra space for another array. You need to do this by modifying the given input array
        int i=0; //pointer 1
        
        for(int j=1;j<arr.length;j++){ //pointer 2
            if(arr[j]>arr[i]){
                arr[i+1]=arr[j];
                i++; //move pointer 1 forward
            }
        }
        
         return i+1; //Return the length of this new array.
     }

     public static int[] leftRotateByOnePlace(int arr[]){
        int firstElement = arr[0]; //bkp first element

        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = firstElement; //sore bkp element to end of array
        return arr;
     }

     public static int[] leftRotateByNplaces(int arr[],int n){

        int d = n % arr.length;    // 6 % 6 == 0 , 6 % 7 == 1
        System.out.println("distance need to rotate : "+d);

        int bkpArr[] = new int[d]; //bkp array
        for(int i=0;i<d;i++){
            bkpArr[i] = arr[i];
        }

        int index=0;
        for(int i=d;i<arr.length;i++){
            arr[index]=arr[i];
            index++;
        }

        for(int i=0;i<bkpArr.length;i++){
            arr[index] = bkpArr[i];
            index++;
        }

        return arr;
     }

    public static int[] divisors(int n) {
        List<Integer> arrList = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i ==0)
                arrList.add(i);
        }

        int arr[] = new int[arrList.size()];

        for(int i=0;i<arr.length;i++){
            arr[i] = arrList.get(i);
        }

        return arr;
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {
        if(n==0 || n==1)
            return true;

       for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1])
            return false;
       }
       return true;
    }

}
