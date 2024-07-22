package DemoSprinBoot.FirstProject;

import org.springframework.stereotype.Component;


@Component
public class VegPizza implements ShopPizza {

	
	public void getPizza() {
		
		System.out.println("This is veg Pizza");
	}

}
