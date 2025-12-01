package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class SentenceIsPangram1832 {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isSentenceIsPangram(sentence));
    }

    public static boolean isSentenceIsPangram(String sentence)
    {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
                set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}