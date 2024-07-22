package DemoSprinBoot.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(FirstProjectApplication.class, args);
		/*Internet in=con.getBean(Internet.class);
		in.connect();
		in.secondMethod();*/
		Buying b=(Buying) con.getBean("buying");
		b.buy();
		Buying b1=(Buying) con.getBean("buying");
		Buying b2=(Buying) con.getBean("buying");
		
	}
}
