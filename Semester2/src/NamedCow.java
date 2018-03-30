
public class NamedCow extends Cow {
	private String newname;
	NamedCow(String type, String name, String sound) {
		super(type,sound);
		newname=name;
	
		
	}
	public String getName(){
		return newname;
	}
}
