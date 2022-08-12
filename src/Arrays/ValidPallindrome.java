package Arrays;

public class ValidPallindrome {

    public String isPallindrome(String s){

       s= s.replaceAll("\\s","");

        return s;
    }

    public static void main(String[] args) {
        ValidPallindrome vd = new ValidPallindrome();
        String s = "A man, a plan, a canal: Panama";

        System.out.println(vd.isPallindrome(s));
    }
}
