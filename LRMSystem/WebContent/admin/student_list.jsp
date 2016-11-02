<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/Css/skin.css" />
<script type="text/javascript">
	function getSelectOption() {
		var myselect = document.getElementById("querytype");
		var index = myselect.selectedIndex;
		return index;
	}

	function getvalue() {
		var a = getSelectOption();
		var form = document.getElementById("myform");
		var input = document.getElementById("input");
		if (a == "0") {
			input.setAttribute("name", "soclassName");
			alert(input.name);
			alert(input.value);
			form.method = "post";
			form.action = "admin/student_studentQueryByClass";
			form.submit();
		}
		if (a == "1") {
			input.setAttribute("name", "studentNumber");
			alert(input.name);
			alert(input.value);
			form.method = "post";
			form.action = "admin/student_studentQueryByNumber";
			form.submit();
		}
		if (a == "2") {
			input.setAttribute("name", "soclassMajor");
			alert(input.name);
			alert(input.value);
			form.action = "admin/student_studentQueryByMajor";
			form.submit();
		}
	}
</script>
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<!-- 头部开始 -->
		<tr>
			<td width="17" valign="top" background="${pageContext.request.contextPath}/Images//mail_left_bg.gif">
				<img src="${pageContext.request.contextPath}/Images//left_top_right.gif" width="17" height="29" />
			</td>
			<td valign="top" background="${pageContext.request.contextPath}/Images//content_bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" background="${pageContext.request.contextPath}/Images//content_bg.gif">
					<tr>
						<td height="31"><div class="title1">学生列表</div></td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" background="${pageContext.request.contextPath}/Images//mail_right_bg.gif"><img
				src="${pageContext.request.contextPath}/Images//nav_right_bg.gif" width="16" height="29" /></td>
		</tr>
		<!-- 中间部分开始 -->
		<tr>
			<!--第一行左边框-->
			<td valign="middle" background="${pageContext.request.contextPath}/Images//mail_left_bg.gif">&nbsp;</td>
			<!--第一行中间内容-->
			<td valign="top" bgcolor="#F7F8F9">
				<table width="100%" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<!-- 空白行-->
					<tr>
						<td colspan="2" valign="top">&nbsp;</td>
						<td>&nbsp;</td>
						<td valign="top">&nbsp;</td>
					</tr>
					<tr>
						<td colspan="4">
							<table>
								<tr>
									<td width="100" align="center"><img
										src="${pageContext.request.contextPath}/Images//mime.gif" /></td>
									<td valign="bottom"><h3 style="letter-spacing: 1px;">在这里，您可以查看学生列表！</h3></td>
								</tr>
							</table>
						</td>
					</tr>
					<!-- 一条线 -->
					<tr>
						<td height="40" colspan="4">
							<table width="100%" height="1" border="0" cellpadding="0"
								cellspacing="0" bgcolor="#CCCCCC">
								<tr>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
					<!-- 产品列表开始 -->
					<tr height="340" valign="top">
						<td width="2%">&nbsp;</td>
						<td width="96%">
							<table width="100%">
								<tr>
									<td width="15%">请选择查询方式： <select id="querytype">
											<option>班级</option>
											<option>学号</option>
											<option>专业</option>
									</select>
									</td>
									<td width="85%">
										<form id="myform">
											<input id="input" type="text" name="" /> <input type="button"
												onclick="getvalue()" value="查询" />
										</form>
									</td>
								</tr>
								<tr>
								<td colspan="2"><br />
									<table class="defaultlist">
										<col width="10%">
										<col width="10%">
										<col width="10%">
										<col width="10%">
										<col width="15%">
										<col width="15%">
										<col width="15%">
										<col width="15%">
										<tr class="title">
											<td>用户ID</td>
											<td>用户名</td>
											<td>学号</td>
											<td>班级</td>
											<td>专业</td>
											<td>年级</td>
											<td>学院</td>
											<td>操作</td>
										</tr>
										<!-- 遍历开始 -->
										<s:iterator value="#session.studentList" var="student">
											<tr>
												<td><s:property value="#student.studentId" /></td>
												<td><s:property value="#student.studentUsername" /></td>
												<td><s:property value="#student.studentNumber" /></td>
												<td><s:property
														value="#student.schoolClass.soclassName" /></td>
												<td><s:property
														value="#student.schoolClass.soclassMajor" /></td>
												<td><s:property
														value="#student.schoolClass.soclassGrade" /></td>
												<td><s:property value="#student.schoolClass.academy" /></td>
												<td><a
													href="<%=path%>/admin/student_studentDelete.action?studentId=<s:property value=" #student.studentId"/>"
													onclick="javascript: return confirm('真的要删除吗？');">删除</a></td>
											</tr>
										</s:iterator>
										<!-- 遍历结束 -->
									</table> <!-- 其他功能超链接 -->
									<div id="TableTail">
										<div id="TableTail_inside">
											<input type="button" onclick="location.href='student_add.jsp'"
												value="新建" />
										</div>
									</div></td>
								</tr>
							</table>
						</td>
						<td width="2%">&nbsp;</td>
					</tr>
					<!-- 产品列表结束 -->
					<tr>
						<td height="20" colspan="4">
							<table width="100%" height="1" border="0" cellpadding="0"
								cellspacing="0" bgcolor="#CCCCCC">
								<tr>
									<td></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td width="2%">&nbsp;</td>
						<td width="51%" class="left_txt"><img
							src="${pageContext.request.contextPath}/Images//icon_mail.gif" width="16" height="11">
							服务邮箱：zhuguangjin@126.com<br /> <img
							src="${pageContext.request.contextPath}/Images//icon_phone.gif" width="17" height="14">
							服务电话：<a href="http://www.mycodes.net/" target="_blank">13512929571</a></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</td>
			<td background="${pageContext.request.contextPath}/Images//mail_right_bg.gif">&nbsp;</td>
		</tr>
		<!-- 底部部分 -->
		<tr>
			<td valign="bottom" background="${pageContext.request.contextPath}/Images//mail_left_bg.gif"><img
				src="${pageContext.request.contextPath}/Images//buttom_left.gif" width="17" height="17" /></td>
			<td background="${pageContext.request.contextPath}/Images//buttom_bgs.gif"><img
				src="${pageContext.request.contextPath}/Images//buttom_bgs.gif" width="17" height="17"></td>
			<td valign="bottom" background="${pageContext.request.contextPath}/Images//mail_right_bg.gif"><img
				src="${pageContext.request.contextPath}/Images//buttom_right.gif" width="16" height="17" /></td>
		</tr>
	</table>
</body>
</html>