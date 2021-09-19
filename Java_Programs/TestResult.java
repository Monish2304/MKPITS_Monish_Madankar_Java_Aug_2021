import mkpits1.Result;
import java.util.*;
class TestResult {
	
public static void main(String []args) {
	
	Result r1=new Result();
	
	Scanner s=new Scanner(System.in);

	System.out.println("Enter Physics marks: ");
	int phy=s.nextInt();
	System.out.println("Enter Chemistry marks: ");
	int chem=s.nextInt();
	System.out.println("Enter Biology marks: ");
	int bio=s.nextInt();

	int total=r1.calculateTotal(phy,chem,bio);
	System.out.println("Total marks = " +total);

	float percentage=r1.calculatPercentage();
	System.out.println("Percentage = " + percentage);

	String grade=r1.calculateGrade();
	System.out.println("Grade = " + grade);
}

}