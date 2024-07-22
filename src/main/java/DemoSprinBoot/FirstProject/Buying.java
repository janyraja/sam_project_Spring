package DemoSprinBoot.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope("singleton")
public class Buying {
	
	@Autowired
	@Qualifier("nonVegPizza")
	
private ShopPizza shop;
	
public Buying(ShopPizza shop)
{
	System.out.println("this is an constructor");
}

public void buy()
{
	System.out.println("This is an method of buy");
	shop.getPizza();
}
	
}
