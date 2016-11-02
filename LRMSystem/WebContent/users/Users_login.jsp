<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="../Css/xgxt_login.css" />
<script type="text/javascript">
	function getvalue() {
		var form = document.getElementById("myuserform");
		var inputradio = document.getElementsByName("role");
		var inputuser = document.getElementById("name");
		var inputpass = document.getElementById("pass");
		
		if(inputradio[0].checked) {
			inputuser.name = "studentUsername";
			inputpass.name = "studentPassword";
			alert(inputuser.name);
			form.method = "post";
			form.action = "${pageContext.request.contextPath}/students/student_studentLogin";
			form.submit();
		}
		if(inputradio[1].checked) {		
			inputuser.name = "teacherUsername";
			inputpass.name = "teacherPassword";
			alert(inputuser.name);
			form.method = "post";
			form.action = "${pageContext.request.contextPath}/teachers/teacher_teacherLogin";
			form.submit();
		}
	}
</script>
<title>用户登录</title>
</head>
<body>
	<div id="header">
		<div class="header_title">
			<span class="title_con">实验室预约管理系统</span>
		</div>
	</div>

	<div id="content">
		<div align="center">
			<div class="con">
				<div class="con_title">
					<span class="con_title_sp">欢迎登录实验室预约管理系统</span>
				</div>
				<div class="con_panel">
					<form id="myuserform">
						<div class="con_input">
							<span>用户名：</span><input id="name" type="text" placeholder="学号/工号"
								name="" />
						</div>
						<div class="con_input">
							<span>密&nbsp;&nbsp;&nbsp;&nbsp;码：</span><input id="pass" type="password"
								placeholder="密码" name="" />
						</div>
						<div class="con_select">
							<input type="radio" name="role" value="学生" />学生 
							<input type="radio" name="role" value="教师" />教师
						</div>
						<input type="button" value="登    录" class="submit-btn"  onclick="getvalue()"/>
					</form>
				</div>
			</div>
		</div>
	</div>

	<div style="text-align: center;">©2016. All rights reserved. 分辨率
		1024*768</div>

</body>
</html>