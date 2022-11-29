
public class CountVowels {
	public void toCountVowelAndConsonants() {
		String str = "Welcome to Brdgelabz";
		str = str.toLowerCase();
		int Vcount = 0,Ccount=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u') {
				Vcount++;
			}else if(ch>='a' && ch<='z') {
				Ccount++;
			}
		}
		System.out.println("number of vowel in string: "+Vcount);
		System.out.println("number of consonants in string: "+Ccount);
	}

	public static void main(String[] args) {
		CountVowels count = new CountVowels();
		count.toCountVowelAndConsonants();
	}

}
