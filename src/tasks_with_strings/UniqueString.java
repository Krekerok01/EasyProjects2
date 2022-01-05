package tasks_with_strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


//выводится самая длинная уникальная строка(без повтора символов)
public class UniqueString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your string:");
        String s = reader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }


    public static int lengthOfLongestUniqueSubstring(String s){
        if (s == null)
            return 0;

        Set<Character> set = new HashSet<>();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (set.size() > maxLength) {
                maxLength = set.size();
            }
            set.clear();

            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                } else {
                    break;
                }
            }
        }
        return set.size() > maxLength ? set.size() : maxLength;
     }
}
