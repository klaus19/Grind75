package Arrays;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPallindrome {

    public boolean isPallindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = (ch.length - 1); i >= 0; i--) {
            sb.append(ch[i]);
        }
        String s1 = sb.toString();
        return s.equals(s1);
    }
    }