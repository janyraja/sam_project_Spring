package DemoSprinBoot.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Internet {
@Autowired
private Airtel connecting;

public void connect()
{
	System.out.println("this is internet");
}
public void secondMethod()
{
	System.out.println("This is the second method of internet class");
	connecting.connection();
	
};
}
