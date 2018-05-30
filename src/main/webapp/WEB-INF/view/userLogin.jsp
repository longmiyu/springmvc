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
 <link rel="stylesheet" href="<%=request.getContextPath()%>/js/css/layui.css">
<title>用户登录</title>

</head>
<body>
<form class="layui-form" action="">
 <div class="layui-form-item" >
    <label class="layui-form-label">手机/邮箱</label>
    <div class="layui-input-inline">
      <input type="text" name="userCode"   lay-verify="required"  class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="userPassword"  lay-verify="required" class="layui-input">
    </div>
  </div>
  
   <div>
	<button id="login" name="login"  class="layui-btn"  lay-submit lay-filter="login">用户登录</button>
	<button id="register" name="register" class="layui-btn layui-btn-primary" onclick="register()">忘记密码</button>
</div>
</form>

<script type="text/javascript">
	layui.use('form', function(){
		 var form = layui.form;
		 
		  //监听提交
		  form.on('submit(login)', function(data){ 
			  ajaxJson("userLogin", data.field, "json");  
		    return false;
		  });
});
</script>
</body>
</html>