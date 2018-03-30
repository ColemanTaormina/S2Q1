import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class studentRunner {
		public static void main(String[] args)throws IOException {
			
			ArrayList<StudentPromotion> people = new ArrayList<StudentPromotion>();
			Scanner inFile = new Scanner (new File("file.txt"));
			
			String a="";
			String b="";
			int c;

			while(inFile.hasNext() ) {
				
				a= inFile.next();
				b = inFile.next();
				c = inFile.nextInt();
				
				if (c <6) {
					people.add(new ElementryStudents(a+""+b,c, inFile.next() ));
				}else if((c >=6)&&(c<9)) {
					people.add(new MiddleSStudent(a+""+b,c, inFile.nextInt()));
				}else if(c>=9){
					people.add(new HighSStudent(a+" "+b,c, inFile.nextInt()));
				}
				
			}
				for(int i=0; i<people.size(); i++) {
				System.out.println(people.get(i).print());
			}	
		System.out.println();
		
		for(int i=0; i<people.size(); i++) {
			if (people.get(i).isPromoted()==true){
				people.get(i).promote();
			}
		System.out.println(people.get(i).promotePrint());
		}
		
		
	}
}
