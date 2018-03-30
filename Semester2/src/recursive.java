
public class recursive {
	public static void main(String[] args)  {
	System.out.println(recursive(3,5));
	}
		public static int recursive (int n, int m) {
			if (n==1) {
				return m;
			}else {
				return m+ recursive(n-1,m);
			}
			
		}

}
