package exercise;

public class Cottage implements Home{
	private int floorCount;
	private double area;
	
	public Cottage(double area, int floorCount) {
		this.area = area;
		this.floorCount = floorCount;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.area;
	}

	@Override
	public int compareTo(Home another) {
		// TODO Auto-generated method stub
		if (this.getArea() > another.getArea()) {
			return 1;
		} else 
		if (this.getArea() < another.getArea()) {
			return -1;
		}	
		else return 0;
	}
	public String toString() {
		String str = this.floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
		return str;
	}

}
