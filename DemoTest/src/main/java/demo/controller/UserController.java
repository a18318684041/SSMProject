package demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.bean.User;
import demo.service.ClassService;
import demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//����id�����û�
	@ResponseBody
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public String findUserById(@PathVariable("id")String id){
		
		Integer userId = Integer.valueOf(id);
		User user = userService.selectUserById(userId);		
		return user.toString();
		
	}
		
	//�����û�
	@ResponseBody
	@RequestMapping(value="/user",method=RequestMethod.POST)
	public String insertUser(User user){
		
		if(user!=null){			
			userService.insertUser(user);			
		}		
		return "success";
		
	}
	
	//��ת�������û���ҳ��
	@RequestMapping(value="/addUser")
	public String toAdd(){
		return "/add";
	}
	
	@RequestMapping(value="/updateUser")
	public String toUpdate(){
		return "/update";
	}
	
	@ResponseBody
	@RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable("id")String id){
		
		Integer userId = Integer.valueOf(id);
		userService.deleteUser(userId);
		return "success";
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/user",method=RequestMethod.PUT)
	public String updateUser(User user){
		
		userService.updateUser(user);
		return "success";	
		
	}
	
	@ResponseBody
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String updateUser(){
		
		List<User> list = userService.findAllUser();
		return list.toString();	
		
	}
	
	/*Batch模式12523*/
	/*普通模式12364*/
	@ResponseBody
	@RequestMapping(value="insert1")
	public String insert1(){
		
		long start = System.currentTimeMillis();
		for(int i = 0;i<500;i++){
		  User user = new  User();
		  user.setName("name"+i);
		  user.setSex("男");
		  userService.insert(user);
		}
		long end = System.currentTimeMillis();
		String times = String.valueOf(end - start);
		return times;
		
	}
	
	/*702*/
	@ResponseBody
	@RequestMapping(value="insert2")
	public String insert2(){
		
		List<User> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for(int i = 0;i<500;i++){
		  User user = new User();
		  user.setName("name"+i);
		  user.setSex("男");
		  list.add(user);
		}
		userService.insertBatch(list);
		long end = System.currentTimeMillis();
		String times = String.valueOf(end - start);
		return times;
		
	}
		

}
