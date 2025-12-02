package Leetcode;

public class RansomeNote383 {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "abc";
        System.out.println(ransomeNote(ransomNote, magazine));
    }

    public static boolean ransomeNote(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        for (int c : ransomNote.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (int m : magazine.toCharArray()) {
            charCount[m - 'a']--;
        }
        for (int val : charCount) {
            if (val > 0) {
                return false;
            }
        }
        return true;
    }
}
