package exercise;

public class Z1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Point point1 = new Point(4, 3);
        Point point2 = new Point(6, 1);
        Segment segment = new Segment(point1, point2);
        Point midPoint = segment.getMidPoint();
        int x = midPoint.getX(); // 5
        int y = midPoint.getY(); // 2
        System.out.println(x);
        System.out.println(y);
        
        Point point11 = new Point(-4, -4);
        Point point22 = new Point(2, 6);
        Segment segment2 = new Segment(point11, point22);
        Point midPoint2 = segment2.getMidPoint();
        int x2 = midPoint2.getX(); // -1
        int y2 = midPoint2.getY(); // 1
        System.out.println(x2);
        System.out.println(y2);
        
        
        
	}

}
