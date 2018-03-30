
public class HonorsDiploma extends  Diploma {
	private String concentration;
	private String de;
	public HonorsDiploma(String first, String last, String degree, String con) {
		super(first, last, degree);
	//	de=degree;
		concentration=con;
		
	}
	public String student () {
		
		return String.format("%s %s %s", super.getLastName(),super.getFirstName(),concentration);
	}
/*public String dip () {
		
		return String.format("%s %s ",de,concentration);
	}*/
	public String getConcentration() {
		// TODO Auto-generated method stub
		return concentration;
	}
}
