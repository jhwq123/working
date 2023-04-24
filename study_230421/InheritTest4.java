package study_230421;
/*
 * 그린서브웨이에서 클래스'빵'의 종류 '오레가노', '화이트', '플랫브래드'
 * 로 만들어진 빵을 상속받은 클래스'고기'의 종류 '스테이크', '치킨', '바베큐'
 * 로 만들어진 고기를 상속받은 클래스'야채'의 종류 '토마토', '양상추', '할라피뇨'
 * 로 만들어진 야채를 상속받은 클래스'소스'의 종류 '마요네즈', '올리브오일', '후추'
 * 를 넣은 샌드위치를 반환해보자
 */

import _subway.BbqMeat;
import _subway.Bever;
import _subway.Bread;
import _subway.CheeseCookie;
import _subway.CokeBever;
import _subway.Cookie;
import _subway.FlatBread;
import _subway.JalapenoVeget;
import _subway.MayoSauce;
import _subway.Meat;
import _subway.Sauce;
import _subway.Subway;
import _subway.Veget;

public class InheritTest4 {
	public static void main(String[] args) {

		Bread b = new FlatBread();
		Meat m = new BbqMeat();
		Veget v = new JalapenoVeget();
		Sauce s = new MayoSauce();

		Subway.setSandwitch(b, m, v, s);
		System.out.println(Subway.getSandwitch());

		System.out.println();

		b = new FlatBread();
		m = new BbqMeat();
		v = new JalapenoVeget();
		s = new MayoSauce();
		Cookie c = new CheeseCookie();
		Bever e = new CokeBever();

		Subway.setComboSandwitch(b, m, v, s, c, e);
		System.out.println(Subway.getSandwitch());

	}
}
