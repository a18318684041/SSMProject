package demo.service;

import java.util.List;

import demo.bean.Clazz;
import demo.bean.Student;

public interface ClassService {

	Clazz selectStudentById(Integer id);
	Clazz getClassByID(Clazz  clazz);
	
}
