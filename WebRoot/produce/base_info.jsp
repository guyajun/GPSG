<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="../themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../themes/icon.css">
<link rel="stylesheet" type="text/css" href="../css/demo.css">
</head>
<body>

	<table>
		<tr>
			<td>
				<div class="easyui-panel"
					style="width:420px;height:260px;padding:10px;" title="������Ϣ">
					<s:iterator value="#request['infos']" id="c4">
						<table width="300px" align="center">
							<tr>
								<td><label>��&nbsp;&nbsp;Ŀ&nbsp;&nbsp;
										��&nbsp;&nbsp;��&nbsp;:</label> <!--   <input name="pro_process" id="pro_process" width="269px" value=""> -->
									<s:property value="#c4.proName" /></td>
							</tr>
							<tr>
								<td><label>��&nbsp;&nbsp;Ŀ&nbsp;&nbsp;��&nbsp;&nbsp;��&nbsp;&nbsp;</label>
									<textarea name="textarea"
										style="width:300px;height:160px; font-size:125%; resize:none;">  
									<s:property value="#c4.description" />
									</textarea></td>
							</tr>
						</table>
					</s:iterator>
				</div></td>
			<td rowspan="2">
				<div class="easyui-panel"
					style="width:700px;height:550px;padding:10px;" title="����λ��">
					<iframe width="670" height="470" frameborder="0" scrolling="no"
						marginheight="0" marginwidth="0"
						src="http://ditu.google.cn/maps?f=q&amp;source=s_q&amp;hl=zh-CN&amp;geocode=&amp;q=%E4%B8%8A%E6%B5%B7%E7%BA%A2%E6%A2%85%E5%8D%97%E8%B7%AF&amp;aq=&amp;sll=31.763239,119.971175&amp;sspn=0.025724,0.045447&amp;brcurrent=3,0x35b2633be24b87d5:0xde5e102b16be8828,0%3B5,0,0&amp;ie=UTF8&amp;hq=&amp;hnear=%E4%B8%8A%E6%B5%B7%E8%99%B9%E6%A2%85%E5%8D%97%E8%B7%AF&amp;ll=31.08491,121.438362&amp;spn=0.20729,0.363579&amp;t=m&amp;z=12&amp;output=embed"></iframe>
					<br />
					<small><a
						href="http://ditu.google.cn/maps?f=q&amp;source=embed&amp;hl=zh-CN&amp;geocode=&amp;q=%E4%B8%8A%E6%B5%B7%E7%BA%A2%E6%A2%85%E5%8D%97%E8%B7%AF&amp;aq=&amp;sll=31.763239,119.971175&amp;sspn=0.025724,0.045447&amp;brcurrent=3,0x35b2633be24b87d5:0xde5e102b16be8828,0%3B5,0,0&amp;ie=UTF8&amp;hq=&amp;hnear=%E4%B8%8A%E6%B5%B7%E8%99%B9%E6%A2%85%E5%8D%97%E8%B7%AF&amp;ll=31.08491,121.438362&amp;spn=0.20729,0.363579&amp;t=m&amp;z=12"
						style="color:#0000FF;text-align:left">�鿴��ͼ</a>
					</small>
				</div></td>
		</tr>
		<tr>
			<td>
				<div class="easyui-panel"
					style="width:420px;height:240px;padding:10px;" title="��Ŀ��Ϣ">
					<s:iterator value="#request['infos']" id="c5">
						<table width="320px" align="center">
							<tr>
								<td>��Ŀ����</td>
								<td><input name="pro_process" id="pro_process"
									style="width:80px;"
									value="<s:property value="#c4.directorId" />"></td>
								<td width="80px;">һ����ȫ�ܼ�</td>
								<td><input name="pro_process" id="pro_process"
									style="width:60px;"
									value="<s:property value="#c4.levelOneId" />"></td>
							</tr>

							<tr>
								<td>����绰</td>
								<td><input name="pro_process" id="pro_process"
									style="width:80px;"
									value="<s:property value="#c4.directorPhone" />"></td>

								<td width="30px;">������ȫ�ܼ�</td>
								<td><input name="pro_process" id="pro_process"
									style="width:60px;"></td>
							</tr>
						</table>
						<table width="320px" align="center">
							<tr>
								<td>��Ƭ���� <input name="pro_process" id="pro_process"
									style="width:210px;"
									value="<s:property value="#c4.produceUnit" />"></td>
							</tr>
							<tr>
								<td>���赥λ <input name="pro_process" id="pro_process"
									style="width:210px;"
									value="<s:property value="#c4.buildUnit" />"></td>
							</tr>
							<tr>
								<td>��Ƶ�λ <input name="pro_process" id="pro_process"
									style="width:210px;"
									value="<s:property value="#c4.designUnit" />"></td>
							</tr>
							<tr>
								<td>���ܵ�λ <input name="pro_process" id="pro_process"
									style="width:210px;"
									value="<s:property value="#c4.manageUnit" />"></td>
							</tr>
							<tr>
								<td>ʩ����λ <input name="pro_process" id="pro_process"
									style="width:210px;"
									value="<s:property value="#c4.constructUnit" />"></td>
							</tr>
						</table>
					</s:iterator>
				</div></td>
		</tr>
	</table>


</body>
</html>
