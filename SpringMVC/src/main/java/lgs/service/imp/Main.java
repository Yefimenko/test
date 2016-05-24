package lgs.service.imp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
		
		BookSI bookSI = applicationContext.getBean(BookSI.class);
		bookSI.save("bukvar");
		
		applicationContext.close();
	}
}
