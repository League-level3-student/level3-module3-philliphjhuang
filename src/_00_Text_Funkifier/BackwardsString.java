package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		StringBuilder ex = new StringBuilder();
		ex.append(s);
		ex=ex.reverse();
		s=ex.toString();
		return s;
	}

}
