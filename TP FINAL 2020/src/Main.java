import org.json.JSONException;

public class Main {

	public static void main(String[] args) throws InterruptedException, JSONException {
		
		//Start start = new Start();
		//start.runProgram();
		
		Operator op = new Operator("cajero");
		
		System.out.println(op.getJsonOperator().getString("category"));

		
	}
}