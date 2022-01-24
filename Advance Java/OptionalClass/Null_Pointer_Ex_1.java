package OptionalClass;

import java.util.Optional;

public class Null_Pointer_Ex_1 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        s[1]="shyam";
        //System.out.println(s[0].toUpperCase());
        //System.out.println(s[1].toUpperCase());

//        //to handle Null_Pointer_Exception...
//        if(s[2]==null)
//        {
//            System.out.println("No Data");
//        }
//        else
//        {
//            System.out.println(s[2].toUpperCase());
//        }

//
//        //First Way...
//        Optional<String> empty=Optional.empty();
//        System.out.println(empty);

//        //Second Way...
//        Optional<String> ob1=Optional.of(s[2]);
//        System.out.println(ob1);

        //Third Way...
        Optional<String> ob2=Optional.ofNullable(s[2]);
        System.out.println(ob2);
    }
}
