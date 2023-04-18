package study_230418;

public class ZenericEx3 {
	public static void main(String[] args) {

		BallBox<RedBall> box = new BallBox<>();
		box.setColor(new RedBall());
		RedBall r = box.getColor();
		System.out.println(r);

		BallBox<BlueBall> box2 = new BallBox<>();
		box2.setColor(new BlueBall());
		BlueBall b = box2.getColor();
		System.out.println(b);

		BallBox<YellowBall> box3 = new BallBox<>();
		box3.setColor(new YellowBall());
		YellowBall y = box3.getColor();
		System.out.println(y);
	}
}
