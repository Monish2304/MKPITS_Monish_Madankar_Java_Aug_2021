import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ob.add(30);
        ob.add(15);
        ob.add(13);
        ob.add(20);
        ob.add(45);
        ob.add(10);
        System.out.println(ob);

        //seperate even nos using stream...
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        List<Integer> m= ob.stream().filter(e -> e % 2==0).collect(Collectors.toList());
        System.out.println(m);
    }
}
