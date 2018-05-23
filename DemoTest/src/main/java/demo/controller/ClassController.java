package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.Clazz;
import demo.bean.Student;
import demo.service.ClassService;

@Controller
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	@RequestMapping(value="/classes/{id}")
	@ResponseBody
	public String findClassWithStudent(@PathVariable("id")String id){
		
		Integer classId = Integer.valueOf(id);
		Clazz clazz = classService.selectStudentById(classId);		
		System.out.println(clazz.getStuList().size());
		for(int i = 0;i<clazz.getStuList().size();i++){
			System.out.println(clazz.getStuList().get(i).toString()+"\n");
		}
		return clazz.toString();
		
	}
	
	
	@RequestMapping(value="/class/{id}")
	@ResponseBody
	public String findClass(@PathVariable("id")String id){
		
		Clazz clazz = new Clazz();
		clazz.setName(null);
		Integer classId = Integer.valueOf(id);
		clazz.setId(classId);
		return classService.getClassByID(clazz).toString();
		
	}

}
