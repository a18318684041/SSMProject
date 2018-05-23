package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.Mapper.ClassDao;
import demo.bean.Clazz;
import demo.bean.Student;

@Service("classService") 
public class ClassImpl implements ClassService{
	
	@Autowired
	private ClassDao classDao;

	@Override
	public Clazz selectStudentById(Integer id) {		
		return classDao.selectStudentById(id);
	}

	@Override
	public Clazz getClassByID(Clazz  clazz) {		
		return classDao.getClassByID(clazz);
	}

	

}
