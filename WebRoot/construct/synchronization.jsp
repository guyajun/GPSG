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
	function submitForm()
	{
	$('#ff2').submit();
	}
	</script>
	<script>
	function submitForm2()
	{
	$('#ff3').submit();
	}
	</script>
  </head>
  
  <body>
   <jsp:include page="../produce/produce_head.jsp"></jsp:include>
     <div class="box-left">
    <div  title="��������" style="width:170px;padding:10px;overflow:hidden;">
  <jsp:include page="../construct/leftmenu.jsp"></jsp:include>
  </div>
  </div>  
  <div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="���ݿ�ͬ��" style="width:auto">
		<div  style="padding:10px 0 10px 0">
	    <form action="constructsyn.action" id="ff2">		
			<a class="easyui-linkbutton" onclick="submitForm();">ͬ�����ݿ�</a>
		</form>
	    </div>
</div>
	<div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="�ļ��ϴ�" style="width:auto">
		<div style="padding:10px 0 10px 0">
   <form id="fileForm" action="constructupload.action" method="post" enctype="multipart/form-data">
        <table id="fileTable">
            <tr>
                <td>
              <label>�ϴ����ļ���</label><input type="file" name="upload" multiple>
                </td>
                <td>
                <label>�ļ�����ѡ��:��</label><select  name="choosefile">
                <option value="1">�ܹ��ƽ����̼�¼��</option>
                <option value="2">ͬ��ע����¼��</option>
                <option value="3">�ܹ��͹�Ƭ��̬����</option>
                </select>
                </td>
            </tr>
        </table>
   </form>
    <a class="easyui-linkbutton" id="load"  onclick="submitForm();">�ϴ�</a>
    </div>
    </div>
</body>
</html>
