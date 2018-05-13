<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
<!-- <script type="text/javascript language="javascript"  src="js/jquery-3.2.1.min.js"></script> -->
<title>Insert title here</title>
<script>  
$(document).ready(function(){
    $('#test1').click(function() {
    	var dart = {"name":"小红","password":21};
    	 $.ajax({ 
    	     data:dart, 
    	     type:"POST", 
    	     dataType: 'json', 
    	     url:"login1", 
    	     success:function(data){ 
    	    	 debugger;
    	        $('#name').val(data.name);
    	        $('#password').val(data.password);
    	        alert(data.password)
    	      },
    	     error:function(data){ 
    	         alert("fail"); 
    	     }

    	}); 
    })
})
</script> 

</head>
<body>
    <form action="login" method="post">
          用户：<input type="text" id = "name" name="name"><br><br>
          密码：<input type="text"  id = "password" name="password"><br><br>
        <input type="submit" value="提交">
    </form>
    
   <input type="button" id="test1" value ="提交1">
</body>
</html>