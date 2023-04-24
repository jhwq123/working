package _subway;

import lombok.Data;

@Data
public class Sandwitch {
	String bread;
	String meat;
	String veget;
	String sauce;
	String cookie = null;
	String bever = null;

	Sandwitch(Bread b, Meat m, Veget v, Sauce s) {
		bread = b.getBread();
		meat = m.getMeat();
		veget = v.getVeget();
		sauce = s.getSauce();
	}

	Sandwitch(Bread b, Meat m, Veget v, Sauce s, Cookie c, Bever e) {
		bread = b.getBread();
		meat = m.getMeat();
		veget = v.getVeget();
		sauce = s.getSauce();
		cookie = c.getCookie();
		bever = e.getBever();
	}
}
