interface inter2
{
    void disp();
}

class two
{
    static void name()
    {
        System.out.println("static method body");
    }
}
public class Static_Method_Ref2 {
    public static void main(String[] args) {
        inter2 ob = two::name;
        ob.disp();
    }
}
