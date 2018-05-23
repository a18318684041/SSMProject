package demo.Mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import demo.bean.User;

/*@Repository("userDao")  */
public interface UserDao {

	public User selectUserById(Integer id);
	
	public HashMap selectUserByIdHashMap(Integer id);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public List<User> findAllUser();
	
	public void deleteUser(int id);
	
	public void insert(User user);
	
	public void insertBatch(List<User> list);
	
}
