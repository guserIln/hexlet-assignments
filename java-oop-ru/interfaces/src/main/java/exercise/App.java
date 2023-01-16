package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

// BEGIN
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Home> appartments = new ArrayList<>(List.of(
			    new Flat(41, 3, 10),
			    new Cottage(125.5, 2),
			    new Flat(80, 10, 2),
			    new Cottage(150, 3)
			));
		
		   

			List<String> result = buildAppartmentsList(appartments, 3);
			System.out.println(result); 
	}

	private static List<String> buildAppartmentsList(List<Home> appartments, int i) {
		// TODO Auto-generated method stub
		Collections.sort(appartments, new SortByArea());
		//return null;
		List<String> result = new ArrayList<String>();
		for (int j=0; j<i; j++) {
			result.add(appartments.get(j).toString());
		}
		return result;
	}

}
// END
