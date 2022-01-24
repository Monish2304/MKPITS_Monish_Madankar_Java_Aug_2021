import java.util.ArrayList;

public class Collection_Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ob.add(30);
        ob.add(20);
        ob.add(15);
        ob.add(10);
        ob.add(40);
        ob.add(5);
        System.out.println(ob);

        //seperate even numbers (foer each loop)...
        ArrayList<Integer> ob1=new ArrayList<Integer>();
        for (Integer integer: ob) {
            if (integer%2==0){
                ob1.add(integer);
            }
        }
        System.out.println(ob1);
    }
}
