import java.util.ArrayList;
public class recursion4 {
	public static void main(String[] args)  {
		int [] numbers= {0,3,5,9,7,9,6};
		int holder=0;
		int counter=0;
			maxElement(numbers,holder, counter);
			
		}
	public static int maxElement (int[] numbers, int holder, int counter) {
		
		if(holder<numbers[counter]) {
			holder=numbers[counter];
		}
		if(counter==numbers.length-1) {
			System.out.println(holder);
		}else {
			counter++;
	maxElement(numbers,holder,counter);	
	
		}
		return holder;
		
	}
}
