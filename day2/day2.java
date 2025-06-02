
//import the hashmaps
import java.util.HashMap;


//today will work on two sum leetcode problem
/**
 * given an array of integers and an integer target, need to return the indexes of the 
 * the 2 numbers that add up to the target
 * example [2,7,11,15] target is 9 the idx is 0 and 1 becahse 2+7 = 9
 * brute force appraoch is the have a double for loop and track to find the 
 * sum of numbers based on the idx
 */
public class day2 {

    public static int[] twoSum(int[] nums, int target) {
    
            //best apprach is to use a hasmap
            //hashmaps have O(1) lookup time and have fast insertions and retrival
            /**
             * HashMap<Integer, Integer> map = new HashMap<>(); -> how to write a hashmap
             * you can inert a keyvalue pair such as map.put(2,0) key = number, and value is the index
             * to get --> map.get(2)
             * to check if a key exist is to do map.containsKey(2) 
             * complent is target - num
             * to solve this we use the complent and seaarch in the array with the hashmap
             * fill the hashmap with the values in the array
             * check if the target - num = 
             * example [2,7,11,15] target = 9 , we set complent to target - num which is 2
             * so 9 -2 = 7, then we check in our map if complent contains the key 7 if it does we return 
             * the target is found
             */
    
             //set hashmap
             HashMap<Integer, Integer> map = new HashMap<>();
             int complent; //integer complent
             //loop through the array and calaute the complent
             for(int i = 0; i < nums.length; i++) {
                //use idx because we will return this
                complent = target - nums[i]; //complent set to target - nums idx
                //check if this complent exist in the map alreaud
                if(map.containsKey(complent)) {
                    //return the complent idx and the num idx
                    return new int[] {map.get(complent), i};
                }
                //else its not in the map so we check the next number
                //we add the current number amd index to the map
                else {
                    map.put(nums[i], i);
                }
             }
    
             //error if no solution found
             throw new IllegalArgumentException("No Solution");
    
    
        }
    
        //test
        public static void main(String[] args) {
            System.out.println("Two Sum Solution ");
            int[] nums = {2,7,11,16};
            int target = 23;
            System.out.println("Solution is...");
            int[] sol = twoSum(nums,target);
        for(int num : sol) {
            System.out.println(num + " ");
        }
    }
    
}
