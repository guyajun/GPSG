<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
  <title>��Ƭ����������Ϣϵͳ</title>
   <link href="../css/produce.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../css/demo.css">
	<script type="text/javascript" src="../js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script>
		function save()
		{
		$('#ff3').submit();
		}
	</script>
	<script type="text/javascript">
	function tf()
	{
	var tf=document.getElementById("test123");
	var gyj=document.getElementById("hi");
	gyj.value=tf.value;
	}
	</script>
 </head>
<body>
	<jsp:include page="../produce/produce_head.jsp"></jsp:include>
    <div class="box-left">
    <div  title="��������" style="width:170px;padding:10px;overflow:hidden;">
		  <ul class="easyui-tree">
		  <s:action name="testMenu" executeResult="true">
		  </s:action>
		  </ul>
	  </div>
	  </div>
<div style="padding:10px;"></div>
	<div id="tt" style="height:768px;">		
			
					<form id="ff3" action="proInfo.action" method="post">		 			
						       <div class="easyui-panel" style="width:420px;height:200px;padding:10px;"title="������Ϣ" >
						      
					               <table width="300px" >
					                   <tr>
									   <td>
											 <label>�ϼ���������</label>
											  </td>
											 <td>
												<select name="proInfo.parentId" style="width:269px;">
													<option value="0" selected></option>
													<s:iterator value="#request.listpro" id="list1">											
														<option value="<s:property value="#list1.id"/>">
															<s:property value="#list1.proName"/>
														</option>	
													</s:iterator>
												</select>
											
											
											 </td>
										</tr>
								     	<tr>
										<td>
											 <label>��&nbsp;&nbsp;Ŀ&nbsp;&nbsp; ��&nbsp;&nbsp;��&nbsp;</label>
											  </td>
											 <td>
											 <input name="proInfo.proName" style="width:269px;" id="test123" onchange="tf()">
											 </td>
									    </tr>
										 <tr>
										 <td>
											 <label>��&nbsp;&nbsp;Ŀ&nbsp;&nbsp;��&nbsp;&nbsp;��&nbsp;&nbsp;</label>
											 </td>
											 <td>
											<textarea name="proInfo.description" cols="40" rows="5" style="height:100px;">
											
											</textarea>
											</td>
											</tr>
											</table> 
								         
			                  </div>
		
							  <div class="easyui-panel" style="width:420px;height:130px;padding:10px;"title="��Ŀ����" >
					               <table width="320px">
					                   <tr>
									   <td>
											 <label>��Ŀ���</label>
											 <select name="proInfo.proBlock" style="width:80px;" >
											  <option>��·���</option>
											  <option selected>Խ�����</option>
											  <option>�������</option>
											  <option>��ɽ���</option>									  
											  </select>
											 </td>
											  <td>
											 <label>�ش���Ŀ</label>
											 <select name="proInfo.importantPro" style="width:80px;">
											  <option value="1" selected>��</option>
											   <option value="0">��</option>
											  </select>
											 </td>
										</tr>
										<tr>
									   <td>
											 <label>�ص��ע</label>
											 <select name="proInfo.keyFocus" style="width:80px;" >
											  <option value="1" selected>��</option>
											  <option value="0">��</option>
											  </select>
											 </td>
											  <td width="179px;">
											 <label>��Ŀ״̬</label>
											 <select name="proInfo.proStatus" style="width:80px;">
											  <option>�ڽ�</option>
											  <option>�ѽ�</option>
											  <option>δ��</option>
											  <option>��Ӫ</option>
											  <option>ά��</option>
											  </select>
											 </td>
										</tr>
										<tr>
									   <td>
											 <label>��Ŀ���</label>
											 <select name="proInfo.proClass" style="width:80px;">
											  <option>����</option>
											  </select>
											 </td>
											  <td>
											 <label>ʡ����Ŀ</label>
											 <select name="proInfo.provincePro" style="width:80px;" >
											  <option value="1" selected>��</option>
											  <option value="0">��</option>
											  </select>
											 </td>
										</tr>	
					                </table>
					               
									</div>
							  
							    <div class="easyui-panel" style="width:420px;height:240px;padding:10px;"title="��Ŀ��Ϣ" >
							  
					               <table width="320px" >
					                   <tr>
											<td>
											 <label>��&nbsp;&nbsp;Ŀ&nbsp;&nbsp; ��&nbsp;&nbsp;��</label>
											 </td>
											 <td>									 																				  
											   <input name="proInfo.directorId" width="269px">																						
											 </td>
										</tr>
										<tr>
											 <td>	
											 <label>һ����ȫ�ܼ�</label>		
											 </td>
											 <td>																			
											  <input name="proInfo.levelOneId" width="269px">	
											
											 </td>
										</tr>
										<tr>
											
											
											  <td>
											 <label>������ȫ�ܼ�</label>	
											 </td>
											 <td>										
											  <input name="proInfo.levelTwoId" width="269px">	
											 </td>
										</tr>	
										<tr>
									   		<td>
											 <label>������λ</label>	
											 </td>
											 <td>						
											   <input name="proInfo.produceUnit" width="269px">
											 </td>
											 </tr>		               
											 <tr>
									   		<td>
											 <label>���赥λ</label>	
											 </td>
											 <td>										
											   <input name="proInfo.buildUnit" width="269px">
											 </td>
											 </tr>
											 <tr>
											  <td>
											 <label>��Ƶ�λ</label>
											 </td>
											 <td>											 
											   <input name="proInfo.designUnit" width="269px">
											 </td>
										</tr>
										 <tr>
											  <td>
											 <label>���ܵ�λ</label>
											 </td>
											 <td>
											   <input name="proInfo.manageUnit" width="269px">
											 </td>
										</tr>
										 <tr>
											  <td>
											 <label>ʩ����λ</label>
											 </td>
											 <td>
											   <input name="proInfo.constructUnit" width="269px">
											 </td>
										</tr>			               
					                
			                
							  </table>	
							  <br />
								
							 
					
				</div>
				   </form>
				   
				   
				   
				 
					<table>
						<tr>
							<td width="185px"></td>
							<td>
								 <div class="easyui-panel" style="width:420px;height:120px;padding:10px;"title="�ϴ�ͼƬ" >
							 	<s:form action="upload.action" method="post" enctype="multipart/form-data">	
									<input id="hi" name="url" style="width:150px;" type="hidden"/>			
									<s:file name="upload" label="�ϴ����ļ�"></s:file>
									<s:submit value="�ϴ�"></s:submit>
								</s:form>
								</div>
							</td>
							
						</tr>
						<tr>
							<td width="185px"></td>
							<td>
								<div style="padding:5px">								
										<a class="easyui-linkbutton" onClick="save()">����</a>
								  </div>
							  </td>
							
						</tr>
					</table>
		</div>
</body>
</html>