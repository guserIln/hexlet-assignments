package exercise;

// BEGIN
public class Segment {
	
	public Point point1;
	public Point point2;
	
	public Segment(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public Point getMidPoint() {
		// TODO Auto-generated method stub
		Point p = new Point((point1.getX() + point2.getX())/ 2, (point1.getY() + point2.getY())/ 2);
		return p;
	}

	public Point getBeginPoint() {
		// TODO Auto-generated method stub
		return this.point1;
	}

	public Point getEndPoint() {
		// TODO Auto-generated method stub
		return this.point2;
	}
	

}
// END
