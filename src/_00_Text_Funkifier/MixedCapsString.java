package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for(int i = 0; i<s.length();i+=2) {
			if(i==0) {
				Character c = s.charAt(i);
				c = Character.toLowerCase(c);
			} else {
				Character c = s.charAt(i);
				c = Character.toUpperCase(c);
			}
		}
		System.out.println(s);
		return s;
	}

}
