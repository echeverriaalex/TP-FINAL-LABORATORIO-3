import org.json.JSONException;
import org.json.JSONObject;

public class Operator {
	
	private String category;
	
	
	public Operator(String category) {
		
		setCategory(category);		
	}
	
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
		
	public void ListProduct() {
		
		
	}
	
	
	public JSONObject getJsonOperator() throws JSONException {
		
		JSONObject operator = new JSONObject();
		
		operator.put("category", getCategory());
				
		return operator;
	}
}