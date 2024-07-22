package DemoSprinBoot.FirstProject.StudentControllerPack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import DemoSprinBoot.FirstProject.StudentServicePack.StudentService;

@Controller
public class StudentController
{
	@Autowired
	private StudentService studentservice;
	@RequestMapping(value = "/studentname",method = RequestMethod.GET)
	@ResponseBody
	public String getStudentName()
	{
		return studentservice.getStudentName();
	}	
	@RequestMapping(value = "/allstudentname",method = RequestMethod.GET)
	@ResponseBody
	public List<String> getAllStudentName()
	{
		return studentservice.getAllStudentName();
	}

}
