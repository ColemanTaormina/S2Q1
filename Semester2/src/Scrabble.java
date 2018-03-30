import java.util.List;
import java.util.ArrayList;
public class Scrabble {
public static void main(String[] args) {
	String tiles = "alk;jfo;abewafojwbegoyes";
	String word = "yessgo";
	
	System.out.print("The tiles can spell "+ word +":"+ canSpell(tiles, word));
	
	
}
public static boolean canSpell(String tiles, String word) {
	char x;
	char y;
	String choice = "";
	
	char[] tile=tiles.toCharArray();
	
	for(int j = 0; j < word.length(); j++) {
		x = word.charAt(j);
		for(int i = 0; i < tiles.length(); i++) {
			y = tile[i];
			if(y == x) {
				choice +=x;
				tile[i]='0';
				break;
			}	
		}
	}
	
if(choice.equals(word))
		return true;
	else
		return false;
}
}
