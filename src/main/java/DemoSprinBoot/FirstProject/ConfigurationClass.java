package DemoSprinBoot.FirstProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
@Bean
public VegPizza vegpizza()
{
	return new VegPizza();
	
}

@Bean
public NonVegPizza nonvegpizza()
{
	return new NonVegPizza();
	
}

@Bean

	public Buying buying()
	{
		return new Buying(vegpizza());
	}
}

