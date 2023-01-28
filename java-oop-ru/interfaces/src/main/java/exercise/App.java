package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Home> appartments = new ArrayList<>(List.of(
			    new Flat(41, 3, 10),
			    new Cottage(125.5, 2),
			    new Flat(80, 10, 2),
			    new Cottage(150, 3)
			));
		
		   

			List<String> result = buildApartmentsList(appartments, 3);
			System.out.println(result); 
	}

	public static List<String> buildApartmentsList(List<Home> appartments, int i) {
		// TODO Auto-generated method stub
		Collections.sort(appartments, new SortByArea());
		if (i > appartments.size()) {
			i = appartments.size();
		}
		List<String> result = new ArrayList<String>();
		for (int j=0; j<i; j++) {
			result.add(appartments.get(j).toString());
		}
		return result;
	}

}
