
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
public class Diploma {
	private String last;
	private String first;
	private String type;
	private static int IDCount=101;
	private String ID;
	private static int dips;
	private static int hdips;
	private static String password="password";
	
	public Diploma(String one, String two, String three) {
		this.last=one;
		this.first=two;
		this.type=three;
		this.ID="ID"+IDCount++;
	}
	public String getLastName() {
		return last;
	}
	public String getFirstName() {
		return first;
	}
	public String getType() {
		return type;
	}
	public String getID() {
		return ID;
	}
	public static int getDips() {
		return dips;
	}
	public static int gethDips() {
		return hdips;
	}
	public static String getPassword() {
		return password;
	}
	public void setType(String s) {
		type=s;
	}
	public static void printDiplomas(ArrayList<Diploma>diplomas, int dip, int hdip) {
		//System.out.println("one");
		for(int i=0; i<diplomas.size();i++) {
			System.out.print(diplomas.get(i).getLastName()+" "+diplomas.get(i).getFirstName()+" "+diplomas.get(i).getType()+" ");
			if(diplomas.get(i).getType().equals("Honors"))
				System.out.print(((HonorsDiploma)diplomas.get(i)).getConcentration()+"");
			System.out.println(diplomas.get(i).getID());
		}
		System.out.println("Basic Diplomas: "+dip+"\n Honors Diplomas: "+hdip);
		System.out.println("one1");
	}
	
	
	//never gets here?(below)
	public static void changeDiploma(ArrayList<Diploma>diplomas,int dip, int hdip) {
		String change;
		String name;
		boolean nameFound=false;
		Scanner in= new Scanner(System.in);
		System.out.println("two2");
		for(int i=0; i<diplomas.size();i++) {
			System.out.print(diplomas.get(i).getLastName()+" "+diplomas.get(i).getFirstName()+" "+diplomas.get(i).getType()+" ");
			if(diplomas.get(i).getType().equals("Honors"))
				System.out.println(((HonorsDiploma)diplomas.get(i)).getConcentration()+"");
			System.out.println();
		}
		System.out.println("Basic Diplomas: "+dip+"\n Honors Diplomas: "+hdip);
		System.out.print("Changes to diplomas types here: y/n");
		change= in.nextLine();
		if(change.equals("n")) {
			System.out.println("No changes");
		}else {
			while(change.equals("y")) {
				nameFound=true;
				for(int i=0; i<diplomas.size();i++) {
			//need help to get more than one person here
		//need something to get false for namefound // does not go to next basic
		//--------
		if(diplomas.get(i).getType().equals("Basic")) {
			System.out.print("Choose concentration: ");
			diplomas.add(i, new HonorsDiploma(diplomas.get(i).getLastName(),diplomas.get(i).getFirstName(), "Honors", in.nextLine()));
			diplomas.remove(i+1);
			hdip++;
			dip--;
			break;
		}else {
			diplomas.get(i).setType("Basic");
			dip++;
			hdip--;
		}
		//}
		}
		if(nameFound==false) {
			System.err.println("Give a valid name: ");
			continue;
		}
		nameFound=false;
		System.out.println("Would you like to make other changes");
		change=in.nextLine();
		}
		}
	dips=dip;
	hdips=hdip;
	}
	}











//	public static ArrayList<Diploma> order(ArrayList<Diploma> diplomas){
//		int x;
//		String name;
//		for(int i=0; i<diplomas.size();i++) {
//			name=diplomas.get(i).getLastName();
//			for(int j=0; j< diplomas.size(); j++) {
//				if (diplomas.get(i).getLastName().compareTo(diplomas.get(j).getLastName())<0)
//					Collections.swap(diplomas, i, j);
//			}
//	}
//		return diplomas;
//	}
//}
	
	


/*
public static void newmethod(ArrayList<Diploma> seniors) {
String one="";
String two="";
String three="";
String four="";


for(int i=0; i<seniors.size();i++) {
	System.out.println(seniors.get(i).getID()+" "+seniors.get(i).student());
}
System.out.println();
Collections.sort(seniors);
for(int i=0; i<seniors.size();i++) {
	System.out.println(seniors.get(i).getID()+" "+seniors.get(i).student());
}

int h=0;
int n=0;
int total=0;
for(int i=0; i<seniors.size();i++) {
if(seniors.get(i).dip().equals("Basic")){
	n=n+1;
}
else {
	h=h+1;
}
}	
total=n+h;
System.out.println("Basic: "+n);
System.out.println("Honors: "+h);
System.out.println("Total: "+total);

change(seniors);

}

public static void change(ArrayList<Diploma> seniors) {
	Scanner in = new Scanner(System.in);
	String name;
	int indexOfLastName=-1;
	String lastName="";
	String firstName="";
	String concentration;
	
	System.out.println("What is your input for the last name u want to change diploma status? ");
	System.out.println("Last name: ");
name=in.nextLine();

for(int i=0; i<seniors.size();i++) {
	if(seniors.get(i).lastNames().equals(name)){
		indexOfLastName=i;
		break;
	}
}
	if  (indexOfLastName==-1) {
		System.err.print("Last name does not work");
	}
	else {
		firstName=seniors.get(indexOfLastName).firstNames();
		lastName=seniors.get(indexOfLastName).lastNames();
	
	if(seniors.get(indexOfLastName).dip().equals("Basic")) {
		System.out.println("The concentration? ");
		concentration=in.nextLine();
		seniors.remove(indexOfLastName);
		seniors.add(indexOfLastName, new HonorsDiploma(firstName,lastName,"Honor", concentration));
	}
	else {
		seniors.remove(indexOfLastName);
		seniors.add(indexOfLastName, new Diploma(firstName,lastName,"Basic"));
	}
	}
	
	for(int i=0; i<seniors.size();i++) {
		System.out.println(seniors.get(i).student());
	}
	int h=0;
	int n=0;
	int total=0;
	for(int i=0; i<seniors.size();i++) {
	if(seniors.get(i).dip().equals("Basic")){
		n=n+1;
	}
	else {
		h=h+1;
	}
	}	
	total=n+h;
	System.out.println("Basic: "+n);
	System.out.println("Honors: "+h);
	System.out.println("Total: "+total);
}
public static final boolean password() {
	Scanner in = new Scanner(System.in);
	String x;
	String cole="cole";
	System.out.println("What is the password: ");
	x=in.nextLine();
	if (x==cole) {
	return true;
}else {
	return false;
}
}
		}
		*/
