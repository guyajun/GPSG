<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
	<title>�������ȫ�����������ܹ��������ƽ̨</title>
	<link href="../css/login.css" rel="stylesheet" type="text/css" />
</head>
	<body>
	<div class="wrapper">
		<form  id="loginform" action="login.action" method="post" >
		<div class="loginBox">
		
		
		  <div class="loginBoxCenter">
<table width="400" cellpadding="0" cellspacing="0" style="margin:30px 0 0 0;">
                   <tr>
                   <td style="color:#FFFFFF;"><label for="username">�û�����</label></td>
                   <td ><input  id="userinfo.loginName" name="userinfo.loginName" class="loginInput" autofocus="autofocus" required="required" autocomplete="off" placeholder="�������û���" value="" /></td></tr>
                       <tr><td style="color:#FFFFFF;"><label for="password">��&nbsp;&nbsp;&nbsp;�룺</label><!--<a class="forgetLink" href="#">��������?</a></p>   -->	</td> 
                    <td><input type="password" id="userinfo.password" name="userinfo.password" class="loginInput" required="required" placeholder="����������" value="" /></td></tr>
                    <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
                    <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
                      </table>
			</div>
			<div class="loginBoxButtons">
            <table width="400" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="middle"> <button class="loginBtn" onClick="$('#loginform').submit()">��¼</button></td>
    <td align="center" valign="middle"><button class="loginBtn" onClick="$('#loginform').submit()">ע��</button></td>
  </tr>
</table>

              <!--  	<input id="remember" type="checkbox" name="remember" />
				<label for="remember">��ס��¼״̬</label>  -->
             
		  </div>
		</div>
		</form>
		<div align="center">Copyright  2013 NETCAST All Rights Reserved </div>
	</div>
</body>
</html>
