package intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams {

    public static void main (String [] args) {
        List<String> list = Arrays.asList ("apple", "banana", "orange");
        Stream<String> stream = list.stream ();
        List<String> streamList = list.stream ()
            .filter (s -> s.startsWith ("a"))
            .map (String::toUpperCase)
            .collect (Collectors.toList ());

        System.out.println (streamList);
    }

}
