
public class Chick implements Animal {
	private String myType;
	private String mySound;
	Chick(String type, String sound, String sndsound){
		myType=type;
		if((((Math.random())*2)+1)==1){
			mySound=sound;
		}else {
			mySound=sndsound;
		}
		
	}
	public String getSound() {
		return mySound;
	}
	public String getType() {
		return myType;
	}
	public NamedCow getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
