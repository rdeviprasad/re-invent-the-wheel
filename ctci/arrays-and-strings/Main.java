import java.util.*;

public class Main {
    public static void main(String[] args) {
        // if(args.length >= 1) {
        //     System.out.println("With space");
        //     System.out.println(isUniqueWithSpace(args[0]));
        //     System.out.println("Without space");
        //     System.out.println(isUniqueWithoutSpace(args[0]));
        // } else {
        //     System.out.println("Need the string to check uniqueness");
        // }

        if(args.length < 2) {
            System.out.println("Need two strings to check for permutation");
        } else {
            System.out.println(isPermutation(args[0], args[1]));
        }
    }

    private static boolean isPermutation(String first, String second) {
        if(first.length() != second.length()) return false;
        int len = first.length();
        Map<Character, Integer> firstCount = new HashMap<>();
        Map<Character, Integer> secondCount = new HashMap<>();
        for(int i = 0; i < len; i++) {
            firstCount.put(first.charAt(i), firstCount.getOrDefault(first.charAt(i), 0) + 1);
            secondCount.put(second.charAt(i), secondCount.getOrDefault(second.charAt(i), 0) + 1);
        }
        
        return firstCount.equals(secondCount);
    }

    private static boolean isUniqueWithSpace(String str) {
        Set<Character> seen = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {
            if(seen.contains(str.charAt(i))) {
                return false;
            }
            seen.add(str.charAt(i));
        }
        return true;
    }

    private static boolean isUniqueWithoutSpace(String str) {
        int len = str.length();
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
