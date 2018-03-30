
public class recursive2 {

	public static void main(String[] args)  {
	String word="Boysdoit";
		recursive2(word, word.length());
		System.out.println("");
		recursive2double(word, word.length());
	}
		public static void recursive2 (String x, int length) {
		
			if(length==1) {
			System.out.println(x.charAt(length-1));
			}else {
		recursive2(x.substring(0,length), length-1);
		System.out.println(x.charAt(length-1));
			}
		}
		public static void recursive2double (String x, int length) {
			//have not finished
			if(length==1) {
				System.out.println(x.charAt(length-1));
				}else {
			
			System.out.println(x.charAt(length-1));
			recursive2double(x.substring(0,length), length-1);
				}
		
		
		}
}
