/*
 * 스프링 설정파일 
 * 
 */
package chap02; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration; 

@Configuration
public class AppContext {
	
	// 14행 ~ 19행 : 스프링은 객체를 생성하고 초기화하는 기능을 제공함. 해당 코드는 한 개 객체를 생성하고 초기화하는 설정을 담고있음.
	// 빈(Bean)객체 : 스프링이 생성하는 객체 
	// 이 빈객체에 대한 정보를 담고있는 메서드가 greeter() 메서드이다. 
	// @Bean 애노테이션을 메서드에 붙이면 해당 메서드가 생성한 객체를 스프링이 관리하는 bean 객체로 등록한다. 
	// @Bean 애노테이션을 붙인 메서드는 객체를 생성하고 알맞게 초기화해야 한다. 
	@Bean
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g; 
	}
}

