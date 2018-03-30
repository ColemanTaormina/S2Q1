
public class TestFarm {
public static void main (String[]args) {
	NamedCow c=new NamedCow("cow","Elsie ","moo");
	System.out.println(c.getType() +" goes "+ c.getSound());
	
	Chick ch=new Chick("chick","cheep ","cluck");
	System.out.println(ch.getType() +" goes "+ ch.getSound());
	
	Pig chi=new Pig("pig","oink");
	System.out.println(chi.getType() +" goes "+ chi.getSound());
	System.out.println("The cow is know as "+c.getName());
	}
}
