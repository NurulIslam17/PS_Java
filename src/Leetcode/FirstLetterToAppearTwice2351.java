package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice2351 {

    public static void main(String[] args) {
        String s = "abcdefcber";
        System.out.println(findLater(s));
    }

    public static Character findLater(String s)
    {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (charSet.contains(s.charAt(i)))
            {
                return s.charAt(i);
            }else{
                charSet.add(s.charAt(i));
            }
        }
        return 'a';
    }

}
