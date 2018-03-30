
public abstract class StudentPromotion {
	private String name; 
	private int grade;
	
	public StudentPromotion(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	
	abstract public boolean isPromoted();
	public String getName() {
		return name;
	}
	
	
	public int getGrade() {
		return grade;
	}
	
	abstract public String print();
	public String promotePrint() {
	return String.format("%s %d",name,grade);
}
public void promote() {
	grade++;
}
}




