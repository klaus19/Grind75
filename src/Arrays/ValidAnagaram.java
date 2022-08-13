package Arrays;

//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.

//Time Complexity O(n)
public class ValidAnagaram {

    public boolean isAnagram(String s,String t){

       if (s.length()!=t.length()){
           return false;
       }

       int[]char_array = new int[26];
       for (int i=0;i<s.length();i++){
           char_array[s.charAt(i)-'a']++;  //subtracts 'a' to get the index of the current alphabet
           char_array[t.charAt(i)-'a']--;
       }
       for (int count:char_array){
           if (count!=0){
               return false;
           }
       }
       return true;
    }

    public static void main(String[] args) {
        ValidAnagaram vd = new ValidAnagaram();
        String str = "anagram";
        String tsd = "nagaram";

        System.out.println(vd.isAnagram(str,tsd));
    }
}
