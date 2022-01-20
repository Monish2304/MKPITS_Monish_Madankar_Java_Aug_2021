import com.sun.org.apache.xml.internal.utils.ListingErrorHandler;

import java.util.ArrayList;
import java.util.List;

public class Strean_Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> ob= new ArrayList<Integer>();
        ob.add(30);
        ob.add(15);
        ob.add(13);
        ob.add(20);
        ob.add(45);
        ob.add(10);

        ob.stream().forEach(System.out::println);
    }
}
