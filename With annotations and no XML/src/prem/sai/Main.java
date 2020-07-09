package prem.sai;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		first okFirst=context.getBean("first",first.class);
		okFirst.display();

	}

}
