interface int3
{
    void disp();
}

class one1
{
    void name()
    {
        System.out.println("static method body");
    }
}

class two2
{
    void disp()
    {
        System.out.println("without static method");
    }
}

public class Static_Method_Ref3 {
    public static void main(String[] args) {
        two2 ob=new two2();
        int3 ob1=ob::disp;
        ob.disp();
    }
}
