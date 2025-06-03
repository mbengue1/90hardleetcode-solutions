
//day 3 java work leet code 
//leet code contains duplicate?
/**
 * given an array of numbers return true if an duplicate occurs in the array 
 * we are given an array with input nums and an output that is boolean
 * first apprach is to use a hashert we first fill the hashaset with the values in the nums
 * if any value appears more than once we auto reject
 */


import java.util.HashSet;


public class day3 {


    //method 
    //instead we can just check if the number is not added then return false otherwire we return true
    public static boolean isDuplicate(int[] nums) {

        //intialize hashmap 
        //and boolean solutions
        boolean sol;
        HashSet<Integer> set = new HashSet<>();

        //fill set with numbers
        for(int num : nums) {
            if(!set.add(num)) {
                return false; //if a duplicate is foudn thenwe return false
            }
        }
        //if everything is added to the set then we reutrn true
        return true;



    }

    //test
    public static void main(String[] args) {
        
        int[] nums = {1,3,5,5,7,9};
        int[] numsGood = {1,2,3,4,5};

        System.out.println("Results for array nums : ");
        System.out.println("Nums contains : ");
        for(int num : nums) {
            System.out.print(" " + num);
        }
        boolean sol1 = isDuplicate(nums);
        System.out.println("Solution is : " + sol1);

        System.out.println("Results for array numsGood : ");
        System.out.println("NumsGood contains : ");
        for(int num : numsGood) {
            System.out.print(" " + num);
        }
        boolean sol2 = isDuplicate(numsGood);
        System.out.println("Solution is : " + sol2);
        


    }


    
}
