<%@page import="dao.factory.DAOFactory"%>
<%@ page language="java" import="java.util.*,model.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<% 
	    request.setCharacterEncoding("gb2312"); 
%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <base href="<%=basePath%>">

  <title>修改读者类型信息</title>

  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <link href="CSS/style.css" rel="stylesheet">
</head>

<body>
  <%@ include file="banner.jsp" %>
    <table width="778" border="0" cellspacing="0" cellpadding="0" align="center">
      <tr>
        <td valign="top" bgcolor="#FFFFFF">
          <table width="99%" height="510" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF"
            class="tableBorder_gray">
            <tr>
              <td height="510" valign="top" style="padding:5px;">
                <table width="98%" height="487" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td height="22" valign="top" class="word_orange">当前位置：读者管理 &gt; 读者类型管理 &gt; 修改读者类型信息 &gt;&gt;&gt;</td>
                  </tr>
                  <tr>
                    <td align="center" valign="top">
                      <table width="100%" height="493" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                          <td align="center" valign="top">
                            <% ReaderType readertype=(ReaderType)session.getAttribute("readertype"); %>

                              <form name="form1" method="post" action="ReaderTypeUpdateServlet">
                                <table width="100%" border="0" cellpadding="0" cellspacing="0">
                                  <tr>
                                    <td height="50" align="center">读者类型名称：</td>
                                    <td><input name="readertypename" type="text" value="<%=readertype.getReadertypename() %>" /></td>
                                  </tr>
                                  <tr>
                                    <td height="50" align="center">可借数量：</td>
                                    <td><input name="number" type="text" value="<%=readertype.getNumber() %>" /></td>
                                  </tr>
                                  <tr>
                                    <td height="35" align="center"><input name="Submit" type="submit" class="btn_grey"
                                        value="保存">
                                      &nbsp;
                                      <input name="Submit2" type="reset" class="btn_grey" value="重置">
                                      &nbsp;
                                      <input name="Submit3" type="button" class="btn_grey" onClick="window.close()"
                                        value="关闭">
                                    </td>
                                  </tr>
                                </table>
                              </form>
                          </td>
                        </tr>
                      </table>
                    </td>
                  </tr>
                </table>
              </td>
            </tr>
          </table>
          <%@ include file="copyright.jsp" %>
        </td>
      </tr>
    </table>
</body>

</html>
