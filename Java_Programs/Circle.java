//wap to accept radius of a circle and print area and circ of circle.
import java.util.*;
class Circle
{
	public static void main(String []args)
	{
		int radius;
		float pi=3.14f;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter radius of a circle: ");
		radius = s.nextInt();

		float area =(float)(3.14 * radius * radius);
		System.out.println("Area of circle = " + area);

		float circ = (float)(2 * 3.14 * radius);
		System.out.println("Circ of circle = " + circ);
	}
}