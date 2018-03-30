
public class HiddenWord {	
	private String word;
	
	public HiddenWord(String x) {
	word=x;
	
	}
	
	public String getHint(String x) {
		String boy="";
		boolean k= false;
		for(int i=0; i<word.length(); i++) {
			x.charAt(i);
			for(int j=0; j<word.length(); j++) {
				if (x.charAt(i)==word.charAt(j)&& i==j) {
					boy+=x.charAt(i);
					k = true;
				}
				else if(x.charAt(i)==word.charAt(j)&& i!=j) {
					boy+='+';
					k = true;
				}
			}
		if (k==false) {
			boy+='*';
		}
		k=false;
		}
	return boy;
		
	}
}
