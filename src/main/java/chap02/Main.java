package chap02; 

// AnnotationConfigApplicationContext 클래스 : 자바 설정에서 정보를 읽어와 빈 객체를 생성하고 관리
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// AnnotationConfigApplicationContext 객체를 생성할 때 앞서 작성한 AppContext 클래스를 생성자 파라미터로 전달함.
		// AnnotationConfigApplicationContext는 AppContext에 정의한 @Bean 설정 정보를 읽어와 Greeter 객체를 생성 및 초기화
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		// getBean() 메서드는 AnnotationConfigApplicationContext가 자바설정을 읽어와 생성한 빈 객체를 검색할때 사용됨.
		// getBean() : 첫번째 파라미터는 @Bean 애노테이션의 메서드 이름인 bean 객체의 이름,  
		// 두번째 파라미터는 검색할 빈 객체의 타
		Greeter g = ctx.getBean("greeter", Greeter.class);
	
		String msg = g.greet("스프링");
	    System.out.println(msg);
	    ctx.close();
			
	}
}