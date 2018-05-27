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
<script type="text/javascript">
window.onload=function (){ 
	layui.use('form', function(){ var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
		  form.render();}); 
layui.use('laydate', function(){
		  var laydate = layui.laydate;laydate.render({ elem: '#test2'});});	
}
layui.use('form', function(){
	  var form = layui.form;  
	  form.on('submit(formDemo)', function(data){
	    /* layer.msg(JSON.stringify(data.field)); */
 	    ajaxJson("saveUpUser", data.field, "json", success);  
	       function success(data) { 
	        	 var data = JSON.parse(data);
	        	 var relust= data.relust
	        	 if(relust>0){
	        		 layer.msg(data.msg);
	        		 
	        	 }
	         };  
	    return false;
	  });
	});

  </script> 
<title>注册</title>
</head>
<body>

<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">职工编码</label>
    <div class="layui-input-inline">
      <input type="text" name="userCode" required  lay-verify="required" placeholder="职工编码"  class="layui-input">
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">职工姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="userName" required  lay-verify="required" placeholder="职工姓名"  class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="userPassword" required lay-verify="required" class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">年龄</label>
    <div class="layui-input-inline">
      <input type="number" name="userAge"  class="layui-input">
    </div>
  </div>
  <div class="layui-form">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">创建时间</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="test2" name="createDate" placeholder="yyyy-MM-dd">
      </div>
    </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">用户类型</label>
    <div class="layui-input-inline">
      <select name="userType" lay-verify="required">
        <option value=""></option>
        <option value="0">管理员</option>
        <option value="1" selected="" >普通用户</option>
      </select>
    </div>
  </div>
  </div>
  
     <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-inline">
      <input type="text" name="email"   lay-verify="email"  autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-inline">
      <input type="radio" name="sex" value="0" title="男">
      <input type="radio" name="sex" value="1" title="女" checked>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>	
</body>
</html>