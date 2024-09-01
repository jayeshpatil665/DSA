import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoHashMap {
    
        public static int mostFrequentElement(int[] nums) {
     
        System.out.println("getting most frequent element from array ! \n");    
        int maxFrequency = 0;
        int maxElement = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();

        //getting element frequency
        for(int i=0;i<nums.length;i++){
            //insert element in map
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); //if already exist increment by 1 then insert
        }

        for(Map.Entry<Integer,Integer> obj : map.entrySet()){
            int ele = obj.getKey();
            int freq = obj.getValue();

            if(freq > maxFrequency){
                maxFrequency = freq; // update highest frequencty
                maxElement = ele; // update element with maximum frequencty
            } else if(freq == maxFrequency) {
                //for array with same frequency or no repeated element
                maxElement = Math.min(maxElement,ele); //storing minimum from array
            }
        }

        return maxElement;
    }

    public int secondMostFrequentElement(int[] nums) {
    
        int maxFreq = 0;
        int maxEle = -1;

        int secondMaxFreq = 0;
        int secondMaxEle = -1;
        Map<Integer,Integer> map = new HashMap<>();

        //getting element Frequency
        for(int i=0;i<nums.length;i++){
            //increase and put into map. If not exist add 0+1
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); //incrementing by one
        }

        //getting element with maximum frequency
        for( Map.Entry<Integer,Integer> obj : map.entrySet()){
            int element = obj.getKey();
            int elementFrequency = obj.getValue();
            if(elementFrequency> maxFreq){
                //storing second max frequency element
                secondMaxEle = maxEle;
                secondMaxFreq = maxFreq;

                //Updating max element
                maxEle = element;
                maxFreq = elementFrequency;
            }
            else if(elementFrequency<maxFreq && elementFrequency>secondMaxFreq){
                //updating secondMax if element is greater than secondMax and less than Max
                secondMaxEle = element;
                secondMaxFreq = elementFrequency;
            }
            else if(elementFrequency == maxFreq){
                maxEle = Math.min(element,maxEle);
            }
            else if(elementFrequency == secondMaxFreq){
                secondMaxEle = Math.min(element,secondMaxEle);
            }
        }

        return secondMaxEle;
    }

    public int sumHighestAndLowestFrequency(int[] nums) {
        //givem
        int n = nums.length;
        int highestFreq = 0;
        int lowestFreq = n;
        Map<Integer,Integer> map = new HashMap<>();

        //get frequency of each element
        for(int i=0;i<n;i++){
            //add one to existing frequency if already exist , else add 1
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        //lowestFreq = Collections.min(map.values());
        //highestFreq = Collections.max(map.values());

        for(int freq : map.values()){
            lowestFreq = Math.min(lowestFreq,freq);
            highestFreq = Math.max(highestFreq,freq);
        }

        return (lowestFreq+highestFreq);
    }

    //Leetcode 451------------------------
        class Pair{
        char ch;
        int frequency;
        Pair(char ch,int frequency){
            this.ch = ch;
            this.frequency = frequency;
        }
    }

    public String frequencySort(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        //getting character frequency into map
        for(char ch : s.toCharArray()){
            Integer chr = (int) (ch);
            map.put(chr,map.getOrDefault(chr,0)+1);
        }

        //Converting Map to list, so that we can sort it later
        List<Pair> list = new LinkedList<>();
        for(Map.Entry<Integer,Integer> obj : map.entrySet()){
            char ch = (char) (int) obj.getKey();
            //System.out.println(ch+" : "+obj.getValue());
            list.add(new Pair(ch,(int) obj.getValue()));
        }

        //Sorting list in decending order
        Collections.sort(list,new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                return b.frequency - a.frequency;
            }
        });

        //Storing list of characters in stringBuffer  by frequency
        StringBuilder str = new StringBuilder(); //thread safe
        for(Pair obj : list){
            //System.out.println(obj.ch+" : "+obj.frequency);

            int frequency = obj.frequency;
            while(frequency > 0){ //adding each character till its frequency
                str.append(obj.ch);
                frequency --;
            }
        }

        //Converting StringBuffer to String
        return str.toString();
    }

    //TUF Basic Strings-------
    public List<Character> frequencySortTUF(String s) {
        //getting character frequency into map
        Map<Integer,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            Integer chr = (int) ch;
            map.put(chr,map.getOrDefault(chr,0)+1);
        }

        //Converting Map to list, so that we can sort it later
        List<Pair> list = new LinkedList<>();
        for(Map.Entry<Integer,Integer> obj : map.entrySet()){
            char ch = (char) (int) obj.getKey();
            list.add(new Pair(ch,(int) obj.getValue()));
        }

        // Sort based on frequency (descending) and alphabetically (ascending)
        Collections.sort(list,new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                if(a.frequency != b.frequency)
                    return b.frequency - a.frequency; // frequency wise desending
                
                return a.ch - b.ch; // alphabetically ascending
            }
        });

        // converting to required List output
        List<Character> charList = new ArrayList<>();
        for(Pair p : list){
            charList.add(p.ch);
        }

        return charList;
    }

    public static void demo(){

        int size = 5;
        System.out.println("Array Size : "+size);
       
        int arr[] = {1,2,3,4,5};
        int maxElement = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<size-1;i++){
            //arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
            maxElement = Math.max(arr[i], maxElement); //(maxElement<arr[i]?arr[i]:maxElement);

            set.add(arr[i]);
        }

        // Arrays.sort(arr);
        // int maxElement =arr[size-1];
         System.out.println("\nMax element : "+maxElement);

         int hashArr[] = new int[maxElement+1];
         Arrays.fill(hashArr, 0);
         for(int i=0;i<size-1;i++){
            hashArr[arr[i]]++;
         }

         System.out.println("Frequency Count : ");

         for(Integer element : set){
            System.out.println( element+" : "+hashArr[element]);
         }

         Integer demoArr[] = {1,3,5,1,6};
         ArrayList<Integer> array_list = 
         new ArrayList<Integer>(Arrays.asList(demoArr));
         System.out.println("Max : "+Collections.max(array_list));

         int element = 7,maxEle=5;
         //maxEle = (element>maxEle)?element:maxEle;
        
         maxEle = Math.max(element, maxEle);
         System.out.println(maxEle);
         //Integer.MIN_VALUE;

         Map<Integer,Integer> map = new HashMap<>(maxEle+1);
         map.put(1, 6);
         map.put(2, 8);
         map.put(3, 9);

        for(Integer ele : map.keySet()){
            System.out.println(ele+" : "+map.get(ele));
        }

        map.put(1, map.getOrDefault(1, 0)+1);

        for(Map.Entry<Integer,Integer> obj : map.entrySet()){
            System.out.println(obj.getKey()+" - "+obj.getValue());
        }

        int lowestFreq = Collections.min(map.values());
        int highestFreq = Collections.max(map.values());

        System.out.println("Min value : "+lowestFreq+" | max value : "+highestFreq);

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
