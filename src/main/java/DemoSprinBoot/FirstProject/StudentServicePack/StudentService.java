package DemoSprinBoot.FirstProject.StudentServicePack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
	public String getStudentName()
	{
		return "This is Jany Trinity";
	}
	public List<String> getAllStudentName()
	{
		List<String> names=new ArrayList<String>();
		names.add("Jany");
		names.add("Raja");
		names.add("Sarah");
		names.add("Hephzibah");
		return names;
	}
}
