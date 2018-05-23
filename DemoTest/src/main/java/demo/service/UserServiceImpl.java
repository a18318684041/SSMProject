package demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.Mapper.UserDao;
import demo.bean.User;

@Service("userService")  
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer id) {
		
		return userDao.selectUserById(id);
		
	}

	public HashMap selectUserByIdHashMap(Integer id) {
		
		return userDao.selectUserByIdHashMap(id);
		
	}

	public void insertUser(User user) {
	
		 userDao.insertUser(user);
		
	}

	public void updateUser(User user) {
	
		userDao.updateUser(user);
		
	}

	public List<User> findAllUser() {
		
		return userDao.findAllUser();
		
	}

	public void deleteUser(int id) {
		
		userDao.deleteUser(id);
		
	}

	@Override
	public void insert(User user) {
		
		userDao.insert(user);
		
	}

	@Override
	public void insertBatch(List<User> list) {
		
		userDao.insertBatch(list);
		
	} 

}
