//need 44
public class MiddleSStudent extends StudentPromotion {
	private int creds = 0;
	private boolean teacherRec;

	public MiddleSStudent(String name, int grade, int credits) {
		super(name, grade);
		creds = credits;
	}

	public boolean isPromoted() {
		if (creds >= 44) {
			return true;
		}
		return false;
	}

	public String print() {
		return String.format("%s %d %s", super.getName(), super.getGrade(), creds);
	}

}