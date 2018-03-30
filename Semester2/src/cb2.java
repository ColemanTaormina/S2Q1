
public class cb2 {


/*
public int factorial(int n) {
if(n==1){
return 1;
}
else{
 return n*factorial(n-1);
}
}
---------------------------------------------

public int bunnyEars2(int bunnies) {
 
if(bunnies==0){
  return 0;
}
 if(bunnies%2!=0){
 return 2+bunnyEars2(bunnies-1);
}

 return 3+bunnyEars2(bunnies-1);

}
---------------------------------------------------------------------
public int count7(int n) {
 if (n==0)
 return 0;
  if(n%10==7){
    return 1+count7(n/10);
}else{
  return 0+count7(n/10);
}
  
}
---------------------------------------------------------
public int countX(String str) {
  if (str.length()==0){
    return 0;
  }
  if (str.charAt(0)=='x'){
    return 1+countX(str.substring(1));
  }
  return 0+countX(str.substring(1));
}
----------------------
public int bunnyEars(int bunnies) {
  if(bunnies==0){
  return 0;
}else{
 return 2+bunnyEars(bunnies-1);
}
}
-----------------------------------
public int fibonacci(int n) {
  if(n==0){
    return 0;
  }
  if (n==1){
    return 1;
  }else{
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
----------------------------------
public int triangle(int rows) {
  if(rows==0){
    return 0;
  }else{
    return (rows)+(triangle(rows-1));
  }
}
-----------------------------------
public int sumDigits(int n) {
  if(n==0){
    return 0;
  }else{
    return n%10+sumDigits(n/10);
  }
}
-------------------------------
---------------------

---------------------
public boolean scoresIncreasing(int[] scores) {
  int counter=0;
  int zero=0;
  for(int i=0;i<scores.length-1;i++){
    if (scores[i+1]<scores[i]){
      counter++;
    }  
  }
  if (counter!=0){
    return false;
  }else{
    return true;
  }
}
----------------------
public int scoresAverage(int[] scores) {
  
  if ( average(scores, 0, (scores.length/2)-1)> average(scores, scores.length/2, scores.length-1) ){
  return   average(scores, 0, (scores.length/2)-1);
  }else{
    return average(scores, scores.length/2, scores.length-1);
  }
  
}
public int average(int[] scores, int start, int end){
  int sum= 0;
  int counter = 0;
  int average;
  
  for(int i = start; i<= end; i++){
    sum= sum + scores[i];
    counter++;
    
  }
  
  average = sum /counter;
  return average;
}
------------------------------------
public List wordsWithoutList(String[] words, int len) {
		ArrayList<String> wordsThatMeatTheRequirement = new ArrayList<String>();
		  int counter =0;
		  String word= "";
		  
		  for ( int i = 0; i<words.length; i++){
		      word = words[i];
		    
		    if( word.length()!=len){
		      wordsThatMeatTheRequirement.add(word);
		    }
		    

		  }
		  
		  return wordsThatMeatTheRequirement;
		  
		}
--------------------------------------
*/
}