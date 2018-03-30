
public class gamejam {
public static void main(String[] args) {
	int num = 1;
	int num2 = 2;
	int sum = 0;
	int even = 0;
	for(int i = 0; i <4000000; i++ ) {
		
		sum = num + num2;
		num=num2;
		num2=sum;
	}
	System.out.print(sum);
}
}
