import java.util.*;
import java.util.List;

public class dz6 {
    public static void main(String[] args) {
        List<String> listWords = Arrays.asList("мама", "тата", "їж їжак желе");
        List<String> newList = new ArrayList<>();

        int count = 0;
        for (String word : listWords) {

            if (hasEvenNumberOfChars(word)) {
                newList.add(word);
                count++;
            }
            if (count == 2) {
                break;
            }
        }
        uniqueSymbols(newList);
    }

    private static void uniqueSymbols(List<String> newList) {
        Set<Character> uniqueSymbols = new HashSet<>();
        for (String word : newList) {
            for (Character character : word.toCharArray()) {
                uniqueSymbols.add(character);
            }
        }
        System.out.println(uniqueSymbols);
    }

    private static boolean hasEvenNumberOfChars(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}