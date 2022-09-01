<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>所有评论信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
			table.gridtable {
				font-family: verdana,arial,sans-serif;
				font-size:11px;
				color:#333333;
				border-width: 1px;
				border-color: #666666;
				border-collapse: collapse;
			}
			table.gridtable th {
				border-width: 1px;
				padding: 8px;
				border-style: solid;
				border-color: #666666;
				background-color: #dedede;
			}
			table.gridtable td {
				border-width: 1px;
				padding: 8px;
				border-style: solid;
				border-color: #666666;
				background-color: #ffffff;
			}
</style>
  </head>
  
  <body>
		  <div align="center">
		  <table border="2px"  style="color: black" class="gridtable">
		  	<tr>
		  		<td>评论编号</td>
		  		<td>姓名</td>
		  		<td>信息类型</td>
		  		<td style="width: 84px; ">信 息</td>
		  		<td>评论</td>
		  		<td>评论事件</td>
		  		<td>操作</td>
		  	</tr>
		  	<c:forEach var="discuss" items="${requestScope.allDiscuss }">
		  	<tr>
		  	  	<td>${discuss[0] }</td>
		  		<td>${discuss[1] }</td>
		  		<td>${discuss[2] }</td>
		  		<td>${discuss[3] }</td>
		  		<td>${discuss[4] }</td>
		  		<td>${discuss[5] }</td>
		  		<td><a href="DiscussDelete?did=${discuss[0] }">删除</a></td>
		  	</tr>
		  	</c:forEach>
		  </table>
		  	</div>
  </body>
</html>
