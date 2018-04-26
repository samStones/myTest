package application.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(){
		
		System.out.println("我要搞冲突");
		System.out.println("我要解决冲突");
		System.out.println("我要搞冲突");
		
		return "hello SpringBoot";
	}
}
