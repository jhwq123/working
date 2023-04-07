package study_230407;

public class TVuser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV)factory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
	}
}
