<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%> <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户列表</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../Css/skin.css" />
</head>
<body>
	<div>
		<div>
			<table width="100%" border="0" cellpadding="0" cellspacing="0">
				<!-- 头部开始 -->
				<tr>
					<td width="17" valign="top"
						background="../Images//mail_left_bg.gif"><img
						src="../Images//left_top_right.gif" width="17" height="29" /></td>
					<td valign="top" background="../Images//content_bg.gif"><table
							width="100%" height="31" border="0" cellpadding="0"
							cellspacing="0" background="./../Images//content_bg.gif">
							<tr>
								<td height="31"><div class="title1">个人信息</div></td>
							</tr>
						</table></td>
					<td width="16" valign="top"
						background="../Images//mail_right_bg.gif"><img
						src="../Images//nav_right_bg.gif" width="16" height="29" /></td>
				</tr>

				<!-- 中间部分开始 -->
				<tr>
					<!--第一行左边框-->
					<td valign="middle"></td>
					<!--第一行中间内容-->
					<td valign="top" bgcolor="#F7F8F9">
						<table width="100%" border="0" align="center" cellpadding="0"
							cellspacing="0">
							<!-- 空白行-->
							<tr>
								<td colspan="2" valign="top"></td>
								<td></td>
								<td valign="top"></td>
							</tr>
							<tr>
								<td colspan="4">
									<table>
										<tr>
											<td width="100" align="center"><img
												src="../Images//mime.gif" /></td>
											<td valign="bottom"><h3 style="letter-spacing: 1px;">在这里，您可以修改的你的个人信息！</h3></td>
										</tr>
									</table>
								</td>
							</tr>
							<!-- 一条线 -->
							<tr>
								<td height="10" colspan="4">
									<table width="100%" height="1" border="0" cellpadding="0"
										cellspacing="0" bgcolor="#CCCCCC">
										<tr>
											<td></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>

		<div>
			<table class="defaultlist">
				<col width="10%">
				<col width="20%">
				<col width="5%">
				<col width="20%">
				<col width="30%">
				<col width="15%">
				<tr class="title">
					<td>学号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>出生日期</td>
					<td>地址</td>
					<td>操作</td>
				</tr>
				<!-- 遍历开始 -->
				<s:iterator value="#session.students_list" var="stu">
					<tr>
						<td>1231</td>
						<td>zhanghanqing</td>
						<td>asdfa</td>
						<td>dfa</td>
						<td>dsafaf</td>
						<td><a>删除</a></td>
					</tr>
				</s:iterator>
				<!-- 遍历结束 -->
			</table>
		</div>
	</div>
</body>
</html>
