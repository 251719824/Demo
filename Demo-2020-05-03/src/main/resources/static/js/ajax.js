//JS问题解决方式: 断点,打桩，排除法
//定义ajax的Get请求函数
function doAjaxGet(url,params,callback){
	//debugger
	//1.创建ajax异步请求对象(这也是ajax技术应用的入口对象)
	var xhr=new XMLHttpRequest();
	//2.设置请求，响应过程的状态监听(通过回调函数处理状态变化)
	xhr.onreadystatechange=function(){
		//4 表示通讯结束
		//200 表示服务端响应ok
		if(xhr.readyState==4&&xhr.status==200){
			// console.log("response text",xhr.responseText)
			//xhr.responseText用于获取服务端的响应结果
			callback(xhr.responseText)
		}
	}
	//3.创建或打开与服务端的链接(设置同步或异步)
	xhr.open("GET",url+"?"+params,true);//true表示异步
	//4.发送异步请求
	xhr.send(null);//Get请求send方法中不传递参数
}
//ajax post 请求
function doAjaxPost(url,params,callback){
	//1.创建ajax异步请求对象(这也是ajax技术应用的入口对象)
	var xhr=new XMLHttpRequest();
	//2.设置请求，响应过程的状态监听(通过回调函数处理状态变化)
	xhr.onreadystatechange=function(){
		//4 表示通讯结束
		//200 表示服务端响应ok
		if(xhr.readyState==4&&xhr.status==200){
			// console.log("response text",xhr.responseText)
			//xhr.responseText用于获取服务端的响应结果
			callback(xhr.responseText)
		}
	};
	//3.创建与服务端的连接
	xhr.open("POST",url,true);
	//post请求必须要设置此请求头
	xhr.setRequestHeader("Content-Type",
	"application/x-www-form-urlencoded");
	//4.发送异步post请求，参数放到send方法中
	xhr.send(params);
}