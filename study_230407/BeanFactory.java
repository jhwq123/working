package study_230407;

public class BeanFactory {
	
	Object getBean(String beanName) {
		// 만약에 beanName이 "samsung"이면 SamsungTV 객체를 반환 한다.
		// 만약에 beanName이 "lg"이면 LgTV 객체를 반환 한다.
		// 그 외면 null을 반환한다.
		if (beanName.equals("samsung")) {
			return new SamsungTV();
		} else if (beanName.equals("lg")) {
			return new LgTV();
		} else {
			return null;
		}
	}
	
}
