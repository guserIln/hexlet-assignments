package exercise;

import java.util.Map;

public class SingleTag extends Tag {

	public SingleTag(String name, Map<String, String> attr) {
		super(name, attr);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		String result = "<" + this.name;
		for(Map.Entry<String, String> entry: attr.entrySet()) {
			   String key = entry.getKey();
			   String value = entry.getValue();
			   result = result + " " + key + "=" + "\"" + value + "\"";
			}
		result = result + ">";
		return result;
	}
	
	
}
