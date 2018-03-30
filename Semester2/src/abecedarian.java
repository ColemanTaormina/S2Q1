public class abecedarian {
	public static void main(String[] args) {
		String a  = "stop";
		boolean abecedarian = isAbecedarian(a);
		System.out.print(abecedarian);
	}
	public static boolean isAbecedarian(String a) {
		int counter=0;
		for (int i=0;i<a.length()-1;i++) {
			if (a.charAt(i)>a.charAt(i+1))
		break;
			counter++;
		}
		if (counter==a.length()-1)
			return true;
		else 
			return false;
			
	}
		
}
