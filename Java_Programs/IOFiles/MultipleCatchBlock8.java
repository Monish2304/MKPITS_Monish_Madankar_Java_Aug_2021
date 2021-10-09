    public class MultipleCatchBlock8 {



static void validate(int age) throws Exception
{
         if(age<18)
          throw new ArithmeticException("not valid");
         else
          System.out.println("welcome to vote");
       }
       public static void main(String args[]){
		   try
		   {
          validate(13);
	  }
	  catch(ArithmeticException ee)
	  {
		  System.out.println(ee.toString());
	  }
          System.out.println("rest of the code...");
      }
  }
