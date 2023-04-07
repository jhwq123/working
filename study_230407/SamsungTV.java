package study_230407;

public class SamsungTV implements TV {
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV 전원을 켭니다.");

	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV 볼륨을 올립니다.");

	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV 볼륨을 내립니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV 전원을 끕니다.");

	}

}
