package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//AnnotationConfigApplicationContext 클래스는 자바 설정에서 정보를 읽어와 빈 객체를 생성, 관리한다.

public class Main {
	public static void main(String[] args) {
		//1. 설정 정보를 이용해서 빈 객체를 생성한다. 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		//AppContext.class를 생성자 파라미터로 전달
		//AppContext에 정의한 @Bean 설정 정보를 읽어온다 --> Greeter 객체를 생성하고 초기화 한다. 
		
		//2. 빈 객체를 제공한다.
		Greeter g = ctx.getBean("greeter",Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}
}
