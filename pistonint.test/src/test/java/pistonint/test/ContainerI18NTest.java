package pistonint.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContainerI18NTest {

	private static ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Application.xml");
	
	public static void main(String[] args) {
//		String applicationName = ctx.getApplicationName();
//		System.out.println(applicationName);
		System.out.println(ctx.getBean("messageSource"));
		
	}
}
