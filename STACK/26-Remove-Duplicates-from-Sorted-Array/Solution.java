import java.util.*;
import java.io.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> myHashSet = new LinkedHashSet();
        //int arr[] = new int[nums.length];
        int i=0;
        for(int element : nums){
            if(!myHashSet.contains(element)){
                myHashSet.add(element);
                //arr[i]= element;
                nums[i]=element;
                i++;
            }
        }
        
       return myHashSet.size();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] operations = new int[]{1,1,2};
        int size =  solution.removeDuplicates(operations);
        System.out.println(size);
    }
}