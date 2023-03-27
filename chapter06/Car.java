package chapter06;

public class Car {
	String color;
	int speed;
	
	Car(String color) { // 기본 생성자
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void speedUp() {
		speed++;
	}
	
	void speedDown() { // 0보다 작으면 안됨.
		if(speed > 0) {
			speed--;			
		} else {
			speed = 0;
		}
	}
	
	void showInfo() {
		System.out.println("<자동차 정보>");
		System.out.println("색깔: "+color);
		System.out.println("스피드: "+speed);
	}
}
