<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jsUtils.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/layer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/layui.js"></script>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/css/layui.css">
<title>首页</title>
<script type="text/javascript">
	function login(){
		
	}
	
	function register(){
		
		var param={
			title:"人员添加",
			hight:"500px",
			width:"600px",	
			url:"register"	
		}

		view.openDilog(param)
	}
</script>
</head>
<body>
	<div>
		<div>
			<button id="login" name="login" class="layui-btn layui-btn-radius layui-btn-normal" onclick="login()">登录</button>
			<button id="register" name="register" class="layui-btn layui-btn-radius" onclick="register()">注册</button>
		</div>
	</div>
</body>
</html>