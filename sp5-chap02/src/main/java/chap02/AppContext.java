package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 해당 클래스를 스프링 설정 클래스로 지정 
public class AppContext {
	
	@Bean
	// 한 개 객체를 생성하고 초기화 하는 설정을 담고 있음 
	// 스프링이 생성하는 객체를 "빈(Bean) 객체"라고 부른다.
	// @Bean 애노테이션을 붙인 메서드는 -- 객체를 생성하고 알맞게 초기화 하여야 한다 --
	public Greeter greeter(){
		Greeter g = new Greeter(); // 객체 초기화
		g.setFormat("%s, 안녕하세요!");
		return g; 
	}
}

