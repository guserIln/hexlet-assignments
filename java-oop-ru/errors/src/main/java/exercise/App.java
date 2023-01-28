package exercise;

public class App {

	public static void main(String[] args) throws NegativeRadiusException {
		// TODO Auto-generated method stub
		// Point point = new Point(3, 4);
		 // Circle circle = new Circle(point, 1);
		 // System.out.println(circle.getRadius()); // 1
		 // System.out.println(circle.getSquare());
		  
		  Point point = new Point(2, 3);
		  Circle circle = new Circle(point, 5);
		  printSquare(circle);
		  // => "50"
		  // => "Вычисление окончено"

		  Circle circle1 = new Circle(point, -2);
		  printSquare(circle1);
	}

	static void printSquare(Circle circle) throws NegativeRadiusException {
		// TODO Auto-generated method stub
		int s1 = (int)Math.ceil(circle.getSquare());
		if (s1 != -1) {
			System.out.println(s1);
		}
		System.out.println("Вычисление окончено");
	}

}
