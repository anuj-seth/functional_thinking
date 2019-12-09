import java.util.*;
import java.util.stream.*;

public class functionalCleanNames {
    public static String cleanNames(List<String> listOfNames) {
        return listOfNames
            .stream()
            .filter(name -> name.length() > 1)
            .map(name -> capitalize(name))
            .reduce((x,y) -> x + "," + y)
            .orElse("");
    }

    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase()
            + s.substring(1, s.length());
    }

    public static void main(String []args) {
        List<String> names = Arrays.asList("neel", "s", "nitin", "j", "mukesh", "vijay", "dinanath", "j", "chauhan",
                                           "amar", "akbar", "anthony");
        System.out.println(cleanNames(names));
    }
}
