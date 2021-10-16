    public class MultipleCatchBlock10 {

void m(){
	try
	{
        int data=50/0;
	}
	catch(Exception ee)
	{
		System.out.println("exception handled m");
	}
      }
      void n(){
        m();
      }
      void p(){

        n();

      }
      public static void main(String args[]){
       MultipleCatchBlock1 obj=new MultipleCatchBlock1();
       try
       {
       obj.p();
        }catch(Exception e){System.out.println("exception handled");}
       System.out.println("normal flow...");
      }




    }
