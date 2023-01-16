package exercise;

public class Flat implements Home {

	private int floor;
	private double balconyArea;
	private double area;
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.area + this.balconyArea;
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
	public Flat(double area, double balconyArea, int floor) {
		this.area = area;
		this.balconyArea = balconyArea;
		this.floor = floor;
	}
	public String toString() {
		String str = "Квартира площадью " + getArea() +" метров на " + floor + " этаже";
		return str;
	}

}
