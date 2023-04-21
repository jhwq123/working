package study_230421;

import _Bread.Bakery;
import _Bread.SauceCodRoe;
/*
 * 추상메소드 '빵' 클래스와 그것을 상속받은
 * '크림빵', '단팥빵', '피자빵', '메론빵', '명란빵' 등을 만들어보자
 * 빵클래스와 상속받은 앙고 종류는 _Bread에 할당되어 있음.
 */
import _Bread.SauceCream;
import _Bread.SauceMelon;
import _Bread.SaucePizza;
import _Bread.SauceRedBeans;

public class InheritTest3 {
	public static void main(String[] args) {

		SauceCream sc = new SauceCream();
		Bakery.setBread(sc);
		Bakery.getBread();

		SauceRedBeans sr = new SauceRedBeans();
		Bakery.setBread(sr);
		Bakery.getBread();

		SauceMelon sm = new SauceMelon();
		Bakery.setBread(sm);
		Bakery.getBread();

		SaucePizza sp = new SaucePizza();
		Bakery.setBread(sp);
		Bakery.getBread();

		SauceCodRoe so = new SauceCodRoe();
		Bakery.setBread(so);
		Bakery.getBread();
	}
}
