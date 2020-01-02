package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder replace = new StringBuilder(s);
		for(int i = 0; i<s.length();i++) {
			if(i==0) {
				Character c = s.charAt(i);
				c = Character.toLowerCase(c);
				replace.setCharAt(i, c);
			} else if(i%2!=0){
				Character c = s.charAt(i);
				c = Character.toUpperCase(c);
				replace.setCharAt(i, c);
			}
		}
		s = replace.toString();
		System.out.println(s);
		return s;
	}

}
