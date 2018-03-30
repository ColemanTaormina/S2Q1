
public class introtostrings {
	public static void main(String[] args) {
String backwards = reverseString("hermione");
//boolean a=isAbecedarian("biospsy");
//String b=isDoubloon("coco");

System.out.println(backwards);
//System.out.println(a);


	}

	//public static String isDoubloon(String b) {
		//int z=0;
		//String v="";
		//while(z<3) {
		
	//	return b;
		//}
//	}

	public static String reverseString(String string) {
		String x = "";
		for (int i = string.length() - 1; i >= 0; i--) {
		x = x + string.charAt(i);
		}
		return x;
	}
/*	public static boolean isAbecedarian(String a) {
int counter=0;
String x = "";
for (int i=0;i<x.length()-1;i++) {
	if (x.charAt(i)>x.charAt(i+1))
break;
	counter++;
}
if (counter==x.length()-1)
	return true;
else 
	return false;
		
	*/




	}

