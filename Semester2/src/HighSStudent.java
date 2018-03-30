// 50 110 170
public class HighSStudent extends StudentPromotion {
	private int creds;
	public HighSStudent(String name, int grade, int credits) {
		super(name, grade);
		creds = credits;
	}
	
	public boolean isPromoted() {
		if(getGrade()==9 && creds<50) {
			return false;
		}else if(getGrade()==10 && creds<110) {
			return false;
		}else if(getGrade()==11 && creds < 170) {
			return false;
		}
		return true;
	}
	
	public String print() {
		return String.format("%s %d %s",super.getName(),super.getGrade(), creds);
	}
}
