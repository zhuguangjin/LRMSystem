<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%> <%@ taglib prefix="s" uri="/struts-tags"%> <%
String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../Css/skin.css" />
</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<!-- 头部开始 -->
		<tr>
			<td width="17" valign="top" background="../Images//mail_left_bg.gif">
				<img src="../Images//left_top_right.gif" width="17" height="29" />
			</td>
			<td valign="top" background="../Images//content_bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" background="./../Images//content_bg.gif">
					<tr>
						<td height="31"><div class="title1">老师课表</div></td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" background="../Images//mail_right_bg.gif"><img
				src="../Images//nav_right_bg.gif" width="16" height="29" /></td>
		</tr>
		<!-- 中间部分开始 -->
		<tr>
			<!--第一行左边框-->
			<td valign="middle" background="../Images//mail_left_bg.gif">&nbsp;</td>
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
										src="../Images//mime.gif" /></td>
									<td valign="bottom"><h3 style="letter-spacing: 1px;">在这里，您可以查看相关课表！</h3></td>
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
									<td colspan="2">
										<table class="defaultlist">
											<tr class="title">
												<td>节数</td>
												<td>星期一</td>
												<td>星期二</td>
												<td>星期三</td>
												<td>星期四</td>
												<td>星期五</td>
												<td>星期六</td>
											</tr>

											<!-- 显示部分 -->										
                                            <!-- 第一大节 -->
											<tr>
												<td style="height: 80px; width: 80px;font-weight: bold; text-align: center">第一大节</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][0].teaTableCourse.courseName}<br>${teaTableShow[0][0].teaSchoolClass.soclassName}<br>${teaTableShow[0][0].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][1].teaTableCourse.courseName}<br>${teaTableShow[0][1].teaSchoolClass.soclassName}<br>${teaTableShow[0][1].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][2].teaTableCourse.courseName}<br>${teaTableShow[0][2].teaSchoolClass.soclassName}<br>${teaTableShow[0][2].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][3].teaTableCourse.courseName}<br>${teaTableShow[0][3].teaSchoolClass.soclassName}<br>${teaTableShow[0][3].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][4].teaTableCourse.courseName}<br>${teaTableShow[0][4].teaSchoolClass.soclassName}<br>${teaTableShow[0][4].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[0][5].teaTableCourse.courseName}<br>${teaTableShow[0][5].teaSchoolClass.soclassName}<br>${teaTableShow[0][5].teaTableRoom.roomLocation}</td>
											</tr>
											<!-- 第二大节 -->
											<tr>
												<td style="height: 80px; width: 80px; font-weight: bold;text-align: center">第二大节</td>
												<td style="height: 80px; width: 180px;font-size:12px; text-align: center">${teaTableShow[1][0].teaTableCourse.courseName}<br>${teaTableShow[1][0].teaSchoolClass.soclassName}<br>${teaTableShow[1][0].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[1][1].teaTableCourse.courseName}<br>${teaTableShow[1][1].teaSchoolClass.soclassName}<br>${teaTableShow[1][1].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[1][2].teaTableCourse.courseName}<br>${teaTableShow[1][2].teaSchoolClass.soclassName}<br>${teaTableShow[1][2].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[1][3].teaTableCourse.courseName}<br>${teaTableShow[1][3].teaSchoolClass.soclassName}<br>${teaTableShow[1][3].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[1][4].teaTableCourse.courseName}<br>${teaTableShow[1][4].teaSchoolClass.soclassName}<br>${teaTableShow[1][4].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[1][5].teaTableCourse.courseName}<br>${teaTableShow[1][5].teaSchoolClass.soclassName}<br>${teaTableShow[1][5].teaTableRoom.roomLocation}</td>
											</tr>
											<!-- 第三大节 -->
											<tr>
												<td style="height: 80px; width: 80px; font-weight: bold;text-align: center">第三大节</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[2][0].teaTableCourse.courseName}<br>${teaTableShow[2][0].teaSchoolClass.soclassName}<br>${teaTableShow[2][0].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px;font-size:12px; text-align: center">${teaTableShow[2][1].teaTableCourse.courseName}<br>${teaTableShow[2][1].teaSchoolClass.soclassName}<br>${teaTableShow[2][1].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[2][2].teaTableCourse.courseName}<br>${teaTableShow[2][2].teaSchoolClass.soclassName}<br>${teaTableShow[2][2].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px;font-size:12px; text-align: center">${teaTableShow[2][3].teaTableCourse.courseName}<br>${teaTableShow[2][3].teaSchoolClass.soclassName}<br>${teaTableShow[2][3].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[2][4].teaTableCourse.courseName}<br>${teaTableShow[2][4].teaSchoolClass.soclassName}<br>${teaTableShow[2][4].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[2][5].teaTableCourse.courseName}<br>${teaTableShow[2][5].teaSchoolClass.soclassName}<br>${teaTableShow[2][5].teaTableRoom.roomLocation}</td>
											</tr>
											<!-- 第四大节 -->
											<tr>
												<td style="height: 80px; width: 80px; font-weight: bold;text-align: center">第四大节</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[3][0].teaTableCourse.courseName}<br>${teaTableShow[3][0].teaSchoolClass.soclassName}<br>${teaTableShow[3][0].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[3][1].teaTableCourse.courseName}<br>${teaTableShow[3][1].teaSchoolClass.soclassName}<br>${teaTableShow[3][1].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[3][2].teaTableCourse.courseName}<br>${teaTableShow[3][2].teaSchoolClass.soclassName}<br>${teaTableShow[3][2].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px;font-size:12px; text-align: center">${teaTableShow[3][3].teaTableCourse.courseName}<br>${teaTableShow[3][3].teaSchoolClass.soclassName}<br>${teaTableShow[3][3].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[3][4].teaTableCourse.courseName}<br>${teaTableShow[3][4].teaSchoolClass.soclassName}<br>${teaTableShow[3][4].teaTableRoom.roomLocation}</td>
												<td style="height: 80px; width: 180px; font-size:12px;text-align: center">${teaTableShow[3][5].teaTableCourse.courseName}<br>${teaTableShow[3][5].teaSchoolClass.soclassName}<br>${teaTableShow[3][5].teaTableRoom.roomLocation}</td>
											</tr>
                                 
										</table>
									</td>
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
							src="../Images//icon_mail.gif" width="16" height="11">
							服务邮箱：zhuguangjin@126.com<br /> <img
							src="../Images//icon_phone.gif" width="17" height="14">
							服务电话：<a href="http://www.mycodes.net/" target="_blank">13512929571</a></td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</td>
			<td background="../Images//mail_right_bg.gif">&nbsp;</td>
		</tr>
		<!-- 底部部分 -->
		<tr>
			<td valign="bottom" background="../Images//mail_left_bg.gif"><img
				src="../Images//buttom_left.gif" width="17" height="17" /></td>
			<td background="../Images//buttom_bgs.gif"><img
				src="../Images//buttom_bgs.gif" width="17" height="17"></td>
			<td valign="bottom" background="../Images//mail_right_bg.gif"><img
				src="../Images//buttom_right.gif" width="16" height="17" /></td>
		</tr>
	</table>
</body>
</html>