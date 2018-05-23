<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加页面</title>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
</head>

<body>

	<form action="" id="userForm">
		名字:<input type="text" name="name"> 
		性别:<input type="text" name="sex"> 
		<input type="button" value="添加"onclick="addUser()">
	</form>
	
	<br>
	
	<button id="btn_del" onclick="deleteUser()">测试delete请求</button><br>
	
	<button id="btn_put" onclick="updateUser()">测试put请求</button><br>
	
	
	<script type="text/javascript">
	

			
		function addUser(){
			
 			$.ajax({
				
				url:"/DemoTest/user",
				type:"post",
				data:$("#userForm").serialize(),
				success:function(data){
					
					alert(data);
					
				}
 			
			}); 
			
		}
		
		
		function deleteUser(){
			
 			$.ajax({
				
				url:"/DemoTest/user",
				type:"post",
		        data:{
	                 _method:"DELETE",
	              },
				success:function(data){
					
					alert(data);
					
				}
 			
			}); 
			
			
		}
		
		function updateUser(){
			
 			$.ajax({
				
				url:"/DemoTest/user",
				type:"put",
				success:function(data){
					
					alert(data);
					
				}
 			
			}); 
			
		}
		
		
		
	
	</script>
	
</body>

</html>