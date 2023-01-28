package exercise;

public class Circle {
	
	private Point point;
	private int radius;
	
	public Circle(Point point, int radius) {
		this.point = point;
		this.radius = radius;
	}
	
	public Point getPoint() {
		return point;
	}
	
	public double getSquare(){
		if (this.radius < 0) {
			try {
			      throw new NegativeRadiusException("Не удалось посчитать площадь");
			}
			catch (NegativeRadiusException ex) {
			}
			return -1;
		} else
		return Math.PI * (Math.pow(radius, 2));
	}

	public int getRadius() {
		return radius;
	}


}
