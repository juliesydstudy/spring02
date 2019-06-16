package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		
		// g1과 g2가 같은 객체인지 여부를 콘솔에 출력 
        System.out.println("(g1 == g2) = " + (g1 == g2));
		ctx.close();
	}
}
