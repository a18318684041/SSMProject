package demo.Mapper;

import java.util.List;

import demo.bean.Clazz;
import demo.bean.Student;

public interface ClassDao {
	
	Clazz selectStudentById(Integer id);
	
	Clazz getClassByID(Clazz  clazz);

}
