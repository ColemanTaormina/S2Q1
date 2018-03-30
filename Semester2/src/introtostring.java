public class introtostring {
	public static void main(String[] args) {
boolean doubloon = isDoubloon("annna");
System.out.print(doubloon);
	}
	public static boolean isDoubloon(String b) {
char x;
char y;
int counter = 0;
int counter2 = 0;
for(int i = 0; i < b.length(); i++) {
	x = b.charAt(i);
	for(int j = 0; j < b.length(); j++) {
		y = b.charAt(j);
		if(x == y)
			counter++;
	}
	if(counter != 2)
		break;
	counter = 0;
	counter2++;
}
if(counter2 == b.length())
	return true;
else
	return false;
}
}
