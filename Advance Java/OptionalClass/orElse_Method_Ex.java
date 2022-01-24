package OptionalClass;

import javax.swing.text.html.Option;
import java.util.Optional;

public class orElse_Method_Ex {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";

        Optional<String> nonEmptyOptional = Optional.ofNullable(s[1]);
        Optional<String> emptyOptional = Optional.empty();

        String orElse = (String) emptyOptional.orElse("Java");

        System.out.println(orElse);
    }
}
