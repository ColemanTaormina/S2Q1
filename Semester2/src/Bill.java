
public class Bill implements Money  {
private double number;	
	public Bill (double x) {
		number=x;
}
	
	
	public double getAmount() {
		return number;
	}
	public String toString(){
		return "$"+number;
	}
}
