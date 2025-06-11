

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * day 6 ,
 * today we work on top k frequenct elemtns
 * given an integer array nums and a integer k 
 * return the most frequent elements 
 * results can be returned in any order
 * for example
 * nums = [1,1,1,2,2,3] and k = 2
 * we need to return the top k(2) elemnts from the array
 * the first intuation is to use a hasmap to retrieve the top elemnts from an array
 * we start with a hashmap fvrequencies and fill the map with <integer, freq> 
 * where integer is the number unqiue such as 1 or 2 o 3 
 * and freq is the frequencies counts of each of the numbers
 * we need to return an integer array just to note 
 * now we have the hashmap that contains the <integer, frequencies> 
 * we need to now take these values out of the hashmap 
 * we need the top k elements how will we do this 
 * ive heard of the bucket array method where we search 
 * to solve we use bucket sorting where each index is the fewuency
 * and each item is the number 
 * so index 4 with value 2 means there was four 2's
 * additioanlly when we get the top k we just loop from the top(end of the bucket to k)
 */


public class day6 {

    public static int[] topKFrequent(int[] nums, int k) {

        //intalize frequce
        HashMap<Integer, Integer> freq = new HashMap<>();

        //get freuwncey
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        //set up bucket array
        List<Integer>[] buckets = new ArrayList[nums.length + 1]; 
        //now we loop through the amp and add 
        //loop through the array again to get each the frequcneis of the values from the map
        for(int num : freq.keySet()) {
            int count = freq.get(num); //getting the freinces of the num 
            //chekc if the buckets value index is empty if its empty we add a new array list to fll values
            if(buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(num); //add the number at the frequcneis index 
        }

        //convert back to array result
        int[] res = new int[k];
        int count = 0;
        for(int i = buckets.length - 1; i >= 0 && count < k; i--) {
            if(buckets[i] != null) {
                for(int num : buckets[i]) {
                    res[count++] = num;
                if(count == k) break;
                }
                
            }
            
        }

        return res;


    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }


    
}
