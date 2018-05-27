<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jsUtils.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.form.js"></script>
<title>Insert title here</title>
<script>  

$(document).ready(function(){
    $('#test1').click(function() {
     	var dart = {"name":"小红","password":21};
     	/**
     	 * 对封装好的ajax请求进行调用
     	 * */
     	ajaxJson("login1", dart, "json", success);      
         function success(data) { 
        	 var data = JSON.parse(data);
            $('#name').val(data.name);
	        $('#password').val(data.password);
         }; 
    })
})

function query (){
	ajaxJson("query", null, "json", success); 
	 function success(data) {
		 debugger;
    	 var data = JSON.parse(data);
    	 $('#infolist').html(''); 
    	 $str = ''; 
    	for(var i = 0; i < data.length; i++){
    		 $str = $str + '<tr>';
    		 $str = $str + '<td id="uer_id"> '+data[i].uer_id+' </td>'; 
    		 $str = $str + '<td id="user_name"> '+data[i].user_name+' </td>';
    		 $str = $str + '<td> '+data[i].user_code+' </td>'; 
    		 $str = $str + '<td> '+data[i].user_password+' </td>'; 
    		 $str = $str + '<td class="update" ><a href="#"> '+"修改"+' </td>'; 
    		 $str = $str + '<td class="del"><a href="#"> '+"删除"+' </td>'; 
    		 $str = $str + '</tr>';
    		 $('#infolist').append($str);

    		 $(".del").bind("click",function(){
    			 debugger;
    			 var str = $(this).closest("tr").find("#user_name").val();
					var ss = $(this).parent().find("#user_name").val();
					alert(str)
    		 
    		 });
    	 };
     }; 
}

function sub(){
    var data = $("#form1").serializeArray(); //自动将form表单封装成json
    alert(JSON.stringify(data));
    var jsonuserinfo = $('#form1').serializeObject();
    alert(JSON.stringify(jsonuserinfo));
}

	
</script> 

</head>
<body>
    <form id ="form1"  method="post">
          用户：<input type="text" id = "name" name="name"><br><br>
          密码：<input type="text"  id = "password" name="password"><br><br>
        <input type="button" onclick="sub()" value="提交">
    </form>
    <div>
		<button id="query" onclick="query()">查询</button>
    </div>
    <table border="2" >
    <thead> 
    <tr> <th>用户ID</th> 
    <th>用户名称</th> 
    <th>生日</th> 
    <th>用户年龄</th> 
    <th colspan = 2>操作</th> 
    </tr> </thead>
	<tbody id="infolist"> 
		
	</tbody>

    </table>
 
   <input type="button" id="test1" value ="提交1">
</body>
</html>