package chapter06;

// A클래스의 필드인 n은 A클래스의
// 인스턴스(태어나는 실체)가 만들어
// 질 때 값을 가지고 있어야 한다.
//A class N은, 생성될 때 값을 가지고 있어야 됨.
//인스턴스마다 서로 다른 값을 가질 수 있어야 한다.

public class A {
	int n;
	int m;
	public A(int n, int m) {
		this.n = n;
		this.m = m;
	}
}

