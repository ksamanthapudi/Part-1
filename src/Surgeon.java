
public class Surgeon extends Doctor{
	
	boolean isOperating;
	
	
	public Surgeon(String name, int number, String specialty, boolean isOperating) {
		super(name, number, specialty);
		this.isOperating = isOperating;
	}


	@Override
	public String toString() {
		return "" +name + " " + number + " "+ specialty+ " "+isOperating;
	}
	
	@Override
	public void work() {
		String operating = "not operating";
		if(isOperating) {
			operating = "operating";
		}
		System.out.println(name + "works for the hospital."+ name+ " is "+ operating+ "now");
	}
	



}
