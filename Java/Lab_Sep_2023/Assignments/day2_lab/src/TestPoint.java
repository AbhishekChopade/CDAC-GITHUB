import java.util.Scanner;
class TestPoint
{
	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter x & y co-ordinates for point p1 :");
		Point2D p1 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("Point p1 = "+p1.show());
		System.out.println("Enter x & y co-ordinates for point p2 :");
		Point2D p2 = new Point2D(sc.nextInt(),sc.nextInt());
		System.out.println("Point p2 = "+p2.show());
		if(p1.isEqual(p2))
			System.out.println("p1 and p2 have same x & y co-ordinates");
		else
			System.out.println("p1 and p2 have different x & y co-ordinates");
		
		double distance = p1.calculateDistance(p2);
		System.out.println("Distance between p1 and p2 is "+distance);
		sc.close();
	}
}