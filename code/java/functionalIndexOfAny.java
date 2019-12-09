import java.util.*;
import java.util.stream.*;

public class functionalIndexOfAny {
    public static int indexOfAny(String str, char[] searchChars) {
        List<Character> searchCharacters = new ArrayList<>();
        for (char c : searchChars) {
            searchCharacters.add(c);
        }
        Set<Character> searchSet =
            new HashSet<>(searchCharacters);

        return IntStream.range(0, str.length())
            .filter(i -> searchSet.contains(str.charAt(i)))
            .findFirst()
            .orElse(-1);
    }

    public static void main(String []args) {
        char[] input_1 = {'z','a'};
        assert indexOfAny("zzabyycdxx", input_1) == 0;

        char[] input_2 = {'b','y'};
        assert indexOfAny("zzabyycdxx", input_2) == 3;

        char[] input_3 = {'z'};
        assert indexOfAny("aba", input_3) == -1;
    }
}


