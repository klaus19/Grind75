package Arrays;

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