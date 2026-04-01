package dl3;
import java.util.*;
import java.util.function.*;

public class StringProcessor {
    public static void processStrings(List<String> words,
                                      Predicate<String> pred,
                                      Function<String, String> func,
                                      Consumer<String> cons) {
        words.stream()
             .filter(pred)
             .map(func)
             .forEach(cons);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("programchalal", "lab", "java");

        Predicate<String> pred = s -> s.length() > 5;
        Function<String, String> func = s -> new StringBuilder(s).reverse().toString();
        Consumer<String> cons = s -> System.out.println("ГАРШИЛ: " + s.toUpperCase());

        processStrings(words, pred, func, cons);
    }
}
