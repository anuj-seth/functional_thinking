import java.util.*;
import java.util.stream.*;

public class cleanNames {
    public static String cleanNames(List<String> listOfNames) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < listOfNames.size(); i++) {
            if (listOfNames.get(i).length() > 1) {
                result.append(capitalizeString(listOfNames.get(i))).append(",");
            }
        }
        return result.substring(0, result.length() - 1).toString();
    }

    public static String capitalizeString(String s) {
        return s.substring(0, 1).toUpperCase()
            + s.substring(1, s.length());
    }

    public static void main(String []args) {
        List<String> names = Arrays.asList("neel", "s", "nitin", "j", "mukesh", "vijay", "dinanath", "j", "chauhan",
                                           "amar", "akbar", "anthony");
        System.out.println(cleanNames(names));
    }
}
