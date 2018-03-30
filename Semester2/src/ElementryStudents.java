// Yes or No to promote
public class ElementryStudents extends StudentPromotion {
	private boolean teacherRec;
	
	public ElementryStudents(String name, int grade, String extraReturn) {
		super(name, grade);
		
		if (extraReturn.equals("Yes")) {
			teacherRec= true;
		}else {
			teacherRec=false;
		}
	}
	
	public boolean isPromoted() {
		return teacherRec;
	}
	public void setTeacherRec(boolean recommendation) {
		teacherRec=recommendation;
	}
	public String print() {
		return String.format("%s %d %s",super.getName(), super.getGrade(), teacherRec);
	}
}
