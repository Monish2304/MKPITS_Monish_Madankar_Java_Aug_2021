import java.util.ArrayList;

public class Stream_Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> ob= new ArrayList<Integer>();
        ob.add(30);
        ob.add(15);
        ob.add(13);
        ob.add(20);
        ob.add(45);
        ob.add(10);
        System.out.println(ob);

        //add +5 to each data using forEach loop and add it to new list...
        ArrayList<Integer> ob1= new ArrayList<Integer>();
        for (Integer integer : ob) {
            ob1.add(integer+5);
        }
        System.out.println(ob1);
    }
}
