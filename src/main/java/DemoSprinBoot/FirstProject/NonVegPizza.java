package DemoSprinBoot.FirstProject;

import org.springframework.stereotype.Component;


@Component
public class NonVegPizza implements ShopPizza{

	public void getPizza() {
	System.out.println("this is non veg pizza");
		
	}

}
