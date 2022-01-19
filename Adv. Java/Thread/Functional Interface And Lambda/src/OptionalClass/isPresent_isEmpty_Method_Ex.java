package OptionalClass;

import java.util.Optional;

public class isPresent_isEmpty_Method_Ex {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";

        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> ob=Optional.ofNullable(s[0]);

        //use of isPresent_Method...
        System.out.println(ob.isPresent());

        //use of isEmpty_Method...
        System.out.println(ob.isEmpty());

        if(ob.isEmpty())
        {
            System.out.println("No Data");
        }
        else
        {
            System.out.println(ob.get().toUpperCase());
        }
    }
}
