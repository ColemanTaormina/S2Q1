
public class recursion3 {
	public static void main(String[] args)  {
		System.out.println(ack(1, 3));
			
		}
	public static int ack (int m, int n) {
		if((m>0)&&(n==0)) {
			return ack(m-1,1);
		}
		if((m>0)&& (n>0)) {
				return ack(m-1,ack(m,n-1));
			}
		return n+1;	
	}
}