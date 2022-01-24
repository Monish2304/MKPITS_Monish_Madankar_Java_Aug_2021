interface int4
{
    void disp(int i);
}

class one11
{
    void name()
    {
        System.out.println("static method body");
    }
}

class two22
{
    void disp()
    {
        System.out.println("without static method");
    }
}

class three33
{
    void three3()
    {
        System.out.println("my constructor");
    }
}

class Static_Method_Ref4 {
    public static void main(String[] args) {
        int4 ob= a-> System.out.println(a);
        ob.disp(10);
    }
}
