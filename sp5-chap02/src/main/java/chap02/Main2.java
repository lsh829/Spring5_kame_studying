package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Singleton 객체
// 싱글톤은 단일 객체를 의미하는 단어로서 
// 스프링은 기본적으로 한개의 @Bean 어노테이션에 대해 한 개의 빈 객체를 생성한다. 
public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		// greeter 인 빈 객체를 구해서 각각 g1, g2 변수에 할당한다. 
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g1==g2)="+(g1==g2)); // g1과 g2의 객체가 서로 같은 것인지 출력한다. --> true 라는 결과가 출력된다. 
		// 즉, 결과가 true 라는 것은 g1과 g2가 같은 객체임을 의미한다. 
		ctx.close();
		
	}

}
