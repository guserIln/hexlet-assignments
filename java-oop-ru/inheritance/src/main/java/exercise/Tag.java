package exercise;

import java.util.Map;

public class Tag {
	
	protected String name;
	protected Map<String, String> attr;
	
	public Tag(String name, Map<String, String> attr) {
		this.name = name;
		this.attr = attr;
	}

}
