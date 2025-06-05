


/**
 * Valid Anagram 
 * an anagram is a string that contains the same exact frequcnies of letter betwen rwo strings
 * the string rat and car are not anagrams 
 * but the string anagram and nagaram are anagrams
 * just off this we know we are calucating the characters frequencies so this must mean
 * we will use a hashmap
 * we will have 2 maps to count the frequences of each of the strings
 * then we will need to determine if both the maps contain the same frequcnes count
 * for strings we can use the .eqauls between the two hashmaps to determine 
 * to check the map
 */

import java.util.HashMap;


public class day4 {


    public static boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        HashMap<Character, Integer> mapS = new HashMap<>();

        HashMap<Character, Integer> mapT = new HashMap<>();

        //convert string s to char 
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //character c is the char at index i
            //now add it to the map
            mapS.put(c, mapS.getOrDefault(c, 0) + 1); //add character c
            //get the frequence if it dones not have one add another 
        }

        //same for other string
        for(int j = 0; j < t.length(); j++) {
            char k = t.charAt(j);

            mapT.put(k, mapT.getOrDefault(k, 0) + 1);
        } 

        //compare maps
        if(!mapS.equals(mapT)) {
            
            return false;
        }

        //else return true 
        return true;

    }

    public static void main(String[] args) {
        
        //test
        String s = "Anagram";
        String t = "nagaram";

        System.out.println("Result is ...." + isAnagram(s, t));

        String a = "cat";
        String b = "rat";
        System.out.println("Result in test 2 is.. " + isAnagram(a, b));
    }

    
}
