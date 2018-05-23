package demo.service;

import java.util.HashMap;
import java.util.List;

import demo.bean.User;

public interface UserService {
	
	User selectUserById(Integer id);  
	
	HashMap selectUserByIdHashMap(Integer id);
	
	void insertUser(User user);

	void updateUser(User user);
	
	List<User> findAllUser();
	
	void deleteUser(int id);
	
	void insert(User user);
	
	void insertBatch(List<User> user);
	
}
