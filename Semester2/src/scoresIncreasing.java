public class scoresIncreasing {

	public static void main(String[] args) {
		int [] array = {1, 3, 4};
		
		System.out.print("The numbers are "+scoresIncreasing(array));
	}
	public static boolean scoresIncreasing(int[] scores) {
		  int counter = 0;
		    for( int i = 0; i<scores.length-1; i++){
		      if ( scores[i+1]<scores[i]){
		        counter++;
		      }
		    }
		    
		    if(counter!=0){
		      return false;
		    }else{
		      return true;
		    }
		    
		}
}
