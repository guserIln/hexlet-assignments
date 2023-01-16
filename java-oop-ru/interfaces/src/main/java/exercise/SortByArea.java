package exercise;

import java.util.Comparator;

public class SortByArea implements Comparator<Home> {

	@Override
	public int compare(Home o1, Home o2) {
		// TODO Auto-generated method stub
		if (o1.getArea() > o2.getArea()) {
			return 1;
		} else 
		if (o1.getArea() < o2.getArea()) {
			return -1;
		}	
		else return 0;
	}

}
