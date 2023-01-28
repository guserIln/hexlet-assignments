package exercise;

import java.util.List;
import java.util.Map;

public class PairedTag extends Tag{
	
	private String body;
	private List<Tag> tags;

	public PairedTag(String name, Map<String, String> attr, String body, List<Tag> tags) {
		super(name, attr);
		this.body = body;
		this.tags = tags;
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
		result = result + body;
		for (Tag tag : tags) {
			String value = tag.toString();
			result = result + value;
		}
		result = result + "</" + this.name + ">";
		return result;
	}

}
