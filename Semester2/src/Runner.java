import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
public class Runner {
	public static void main(String[] args) throws IOException {
		Scanner inFile = new Scanner(new File("file.txt"));
		Scanner in=new Scanner(System.in);
		ArrayList<Diploma> diplomas =new ArrayList <Diploma>();
		String change;
		String name;
		String last;
		 String first;
		 String type;
		 String concentration;
		 String password;
		 boolean done=false;
		 int dip=0;
		 int hdip=0;
		
		while (inFile.hasNext()) {
			System.out.println("one");
			first=inFile.next();
			last=inFile.next();
			type=inFile.next();
			if(type.equals("Honors")) {
				concentration= inFile.next();
				diplomas.add(new HonorsDiploma(last,first,type,concentration));
				hdip++;
			}else {
				diplomas.add(new Diploma(last,first,type));
				dip++;
			}
		}
		//diplomas=Diploma.order(diplomas);
		Diploma.printDiplomas(diplomas, dip, hdip);
		
		while(done==false) {
			System.out.println("two");
			System.out.print("Type in the password: ");
			password=in.nextLine();
			
			if(Diploma.getPassword().equals(password)) {
				System.out.println();
				Diploma.changeDiploma(diplomas, dip, hdip);
				//error in this part in diploma
				done=true;
			}else 
				System.err.println("incorrect password");
			}
			dip=Diploma.getDips();
			hdip=Diploma.gethDips();
			Diploma.printDiplomas(diplomas, dip, hdip);
		}
		}
		/*	for(int i=0; i<seniors.size();i++) {
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
		*/
	//}
		
		
	
	//}








