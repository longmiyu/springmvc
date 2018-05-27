/**
 * ajax请求数据
 */
/*document.write("<script language=javascript src='<%=request.getContextPath()%>/js/query-3.2.1.min.js'></script>");
document.write("<script language=javascript src='<%=request.getContextPath()%>/js/layer.js'></script>");*/
//作为对象方法，函数写法，这里创建了两个函数外面用{}包裹起来
var view = {		
	openDilog:function(param,url){
		debugger;
		var title=param.title;
		var hight=param.hight;
		var width=param.width;
		var url=param.url;
		
		layer.open({
			 type: 2,
		      title: title,
		      shadeClose: false,
		      shade: 0.5,
		      maxmin: true, //开启最大化最小化按钮
		      anim: 1 ,
		      area: [hight, width],
		      content: "openDilog?url="+url+""
			});	
		}
		,run2:function(){
		alert('这个必须放在一个对象内部，放在外边会出错！');//这里是你函数的内容
		}
}

 function ajaxJson (url,param,dataType,success){
param =JSON.stringify(param)
alert(param)
	ajax({
 	    url:url, //请求地址
 	    type:'POST',   //请求方式
 	    data:param, //请求参数
 	    dataType:"json",     // 返回值类型的设定
 	    async:false,   //是否异步
 	    success:success,
 	/*    success:function (response,xml) {
 	        console.log(response);   //   此处执行请求成功后的代码
 	    },*/
 	    fail:function (status) {
 	        console.log('状态码为'+status);   // 此处为执行成功后的代码
 	    }

 	});
}

function ajax(options) {
	debugger;
    /**
     * 传入方式默认为对象
     * */
    options = options || {};
    /**
     * 默认为GET请求
     * */
    options.type = (options.type || "GET").toUpperCase();
    /**
     * 返回值类型默认为json
     * */
    options.dataType = options.dataType || 'json';
    /**
     * 默认为异步请求
     * */
    options.async = options.async || true;
    /**
     * 对需要传入的参数的处理
     * */
    var params = options.data;//getParams(options.data);
    var xhr;
    /**
     * 创建一个 ajax请求
     * W3C标准和IE标准
     */
    if (window.XMLHttpRequest){
        /**
         * W3C标准
         * */
        xhr = new XMLHttpRequest();
    }else{
        /**
         * IE标准
         * @type {ActiveXObject}
         */
        xhr = new ActiveXObject('Microsoft.XMLHTTP')
    }
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4){
            var status = xhr.status;
            if (status >= 200 && status < 300 ){
                options.success && options.success(xhr.responseText,xhr.responseXML);
            }else{
                options.fail && options.fail(status);
            }
        }
    };
    if (options.type == 'GET'){
        xhr.open("GET",options.url + '?' + params ,options.async);
        xhr.send(null)
    }else if (options.type == 'POST'){
        /**
         *打开请求
         * */
        xhr.open('POST',options.url,options.async);
        /**
         * POST请求设置请求头
         * */
        xhr.setRequestHeader('Content-Type','application/json ;charset=utf-8');
        /**
         * 发送请求参数
         */
        xhr.send(params);
    }
}
/**
 * 对象参数的处理
 * @param data
 * @returns {string}
 */
function getParams(data) {
    var arr = [];
    for (var param in data){
        arr.push(encodeURIComponent(param) + '=' +encodeURIComponent(data[param]));
    }
    console.log(arr);
    arr.push(('randomNumber=' + Math.random()).replace('.'));
    console.log(arr);
    return arr.join('&');
}

