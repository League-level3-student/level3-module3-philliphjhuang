package _00_Text_Funkifier;

public class CustomString extends SpecialString {

	public CustomString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		StringBuilder replace = new StringBuilder(s);
		for(int i = 0; i<s.length();i++) {
			Character c = s.charAt(i);
			c = Character.toLowerCase(c);
			replace.setCharAt(i, c);
		}
		s=replace.toString();
		System.out.println(s);
		return s;
	}

}
