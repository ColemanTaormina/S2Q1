//Coleman Taormina
//Palindrama
//1/17/18

public class Taormina_Palindrama {
	public static void main(String[] args) {
		String z  = "aba";
		//put in the chosen string here then run
		String choice = ischoice(z);
		System.out.print("Your Palindrama: "+choice);
		//sends the  string to the method bellow and then prints it
	}
		public static String ischoice(String z) {
		int counter=0;
		int counterholder=0;
		int location=0;
		int y=0;
		int j=1;
		String boy="";
			int newi=1;
			int newj=0;
		
			if( z.length()==1||z.length()==2) {
				boy+= z.charAt(0);
			//checks if the string is just a ploy to trick the system/ a no palindrama series of letters
		}
			else if(z.length()>2) {
				//if not a trick then the checking for a palindrama begins
			if (z.length()%2==0) 
				y=z.length()-2;
			//checks if the string is a odd or even to get a better answer for the length
			if (z.length()%2!=0) 
				y=z.length()-1;
			//this loop checks for only palindrama's with a single letter center
		for (int i=1;i<y;i++) {
			 //the loop checks the elements to the left and right and continues till the palindrama stops
			while (((i-j)>=0) && ((i+j)<=z.length()-1) && z.charAt(i-j)==z.charAt(i+j) ){    
				//the loop checks that the checked left and right values exist then check if they are equal
				counter=counter+1;
				j=j+1;
				if(j>newj) {
					newj=j;
					newi=i;
					//the variables newj and newi hold the element center and number of elements outward from the center of the palindrama
				}
			}
			
			//--------
			if (counter>counterholder) {
				counterholder=counter;
				//the counter will be key to check if the palindrama has a double letter middle or a single
				
			}
			j=1; 
			//resets j as to make the next elements to be checked to find the greates palindrama
		}
		//------------------------------
		int counter2=0;
		int counterholder2=0;
		int location2=0;
		int b=1;
		int newb=1;
		int x=0;
		int newa=0;
		int counter3=1;
		//both set up variable x for loop
		if (z.length()%2==0) 
			x=z.length()-1;
		//set up variable x for loop
		if (z.length()%2!=0) 
			x=z.length()-1;
		//a starts at two since the double middle of the palindrama is checked for here
		for (int a=2;a<x;a++) {
		//the loop continues when the element is not out of bounds, has a variable fold equal to it
			while ((((a-b)-1)>=0) && (((a+b)+1)<=z.length()) && z.charAt(a)==z.charAt(a-1) && z.charAt((a-b)-counter3)==z.charAt(a+b) ){    
				counter2=counter2+1;
				b=b+1;
				if(b>newb) {
					newb=b;
					newa=a;
					//the variables newj and newi hold the element center and number of elements outward from the center of the palindrama
				}
				
			}
		
		if (counter2>counterholder2) {
			counterholder2=counter2;
			//the counter will be key to check if the palindrama has a double letter middle or a single
			
		}
		b=1;
		counter3=1;
		//resets the loop
		
	}	
		//-------------------------------
		int newnewj= newj-1;
		newnewj= (newnewj)*2; //doubles length of center to end of palindrama
		newnewj=newnewj+1;
		int lengthofp=newnewj;
		lengthofp=(lengthofp-1)/2;
		//new variables created to form the palindrama out of the middle element and the length from the center to the right most palindrama end value
		
		//if the single variable number is greater than the double middle varable palindrama then the loop here prints the new palindrama
		if(newj>newb) { 
		
		for (int i=0; i<=(newnewj-1); i++) {
			if(counter!=0) {
			boy+=(z.charAt(newi-lengthofp));	
			//adds the new string of a palindrama together
			newi=newi+1;
			}
		}
		}
		//-------------------------------------------
		int m=(newb);
		int newnewa=m*2;//length of palandrama
		
		if (newb>newj) {
			for (int i=0; i<=(newnewa-1); i++) {
				if(counter2!=0) {
				boy+=(z.charAt(newa-m));	
				//adds the new string of a palindrama together
				newa=newa+1;
				}
			}
		}
		//---------------------------
		if (counter==0 && counter2==0) {
			boy+=(z.charAt(0));
			//if neither of the loops had a palindrama of length of 3 or greater than the first element is the longest palindrama
		}
		return boy;	
	}	
			return boy;
		}
}
