
public class recursionbinary {

	public static void main(String[] args)  {
		int [] numbers= {1,3,4,6,7,10,22,33,45,89,102,117,121,200};
		int holder=3;
		int counter=0;
		int low=0;
		int high=numbers.length;
		int index=((low+high)/2);
		int a=binary(numbers, holder, low, high,index,counter);
	if(a!=-1) {
		System.out.println("The number is at index "+a);
	}else {
		System.out.println("The value is not in the array"+a);
	}
	}
		public static int binary(int[] numbers, int holder, int low, int high, int index, int counter) {
			counter++;
			
			if (counter>numbers.length) {
				return -1;
			}
			if(holder==numbers[index]) {
				
				return index;
			}
			if(numbers[index]<holder) {
				low=index;
				index=((low+high)/2);
				return binary(numbers, holder, low, high,index,counter);	
			}
			else {
				high=index;
				index=((low+high)/2);
			return	binary(numbers, holder, low, high,index,counter);	
			}
			
		}
}
