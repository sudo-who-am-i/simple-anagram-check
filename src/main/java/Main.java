import java.util.Scanner;

public class Main {

    private static int LCASE_LOWER_BOUND = 97;
    private static int LCASE_UPPER_BOUND = 122;
    private static int CHAR_RANGE = LCASE_UPPER_BOUND - LCASE_LOWER_BOUND + 1;

    public static void main(String ... args) {
        var scan = new Scanner(System.in);
        System.out.println("Enter original string: ");
        String line1 = scan.nextLine();
        System.out.println("Enter string to check for anagram: ");
        String line2 = scan.nextLine();

        System.out.println(isAnagram2(line1, line2));
    }

    /**
     * Method checks if two given strings are anagrams. The method ignores other characters
     * than alphabetical to make text comparison possible.
     * @param a Original string
     * @param b String to check
     * @return Check result
     */
    public static boolean isAnagram2(final String a, final String b) {
        if (a == null || b == null) return false;
        if (a.isEmpty() || b.isEmpty()) return false;
        if (a.equals(b)) return true;

        var occurArrA = getOccurrencesArray(a.toLowerCase());
        var occurArrB = getOccurrencesArray(b.toLowerCase());

        for (var i = 0; i < CHAR_RANGE; i++) {
            if (occurArrA[i] < occurArrB[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns integer array containing number of occurrences of ASCII
     * lowercase alphabetical characters
     * @param input input string
     * @return character occurrences array
     */
    private static int[] getOccurrencesArray(String input) {
        var chars = input.toCharArray();
        var occur = new int[CHAR_RANGE];
        for (char c : chars) {
            if (c >= LCASE_LOWER_BOUND && c <= LCASE_UPPER_BOUND) {
                occur[c - LCASE_LOWER_BOUND] = occur[c - LCASE_LOWER_BOUND] + 1;
            }
        }
        return occur;
    }
}
