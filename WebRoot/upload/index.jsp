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
	$('#fileForm').submit();
	}
	</script>
	
	 <script type="text/javascript">   
        //���һ��<tr>
        function add(){
            var content = "<tr><td>";
            content += "<label>�ϴ����ļ���</label><input type='file' name='upload'>";
            content +="</td></tr>";
            $("#fileTable").append(content);
        }
        
        //ɾ����ǰ��<tr>
        function remove(obj) {
            $(obj).parent().parent().remove();
        }
     </script>
	
  </head>
<body>
	<jsp:include page="../produce/produce_head.jsp"></jsp:include>
	<div class="box-left">
		<div title="��������" style="width:170px;padding:10px;overflow:hidden;">
			<ul class="easyui-tree">
				<s:action name="testMenu" executeResult="true" />
			</ul>
		</div>
	</div>
	<div style="margin:10px 0;"></div>
	<div class="easyui-panel" title="�ļ��ϴ�" style="width:auto">
		<div style="padding:10px 0 10px 0">
   <form id="fileForm" action="uploadPro.action" method="post" enctype="multipart/form-data">
        <table id="fileTable">
            <tr>
                <td>
              <label>�ϴ����ļ���</label><input type="file" name="upload" multiple>
                </td>
                <td>
                <label>�ļ�����ѡ��:��</label><select  name="choosefile">
                <option value="1">��Ƭ�ֽ�ӹ���������</option>
                <option value="2">��Ƭ�ֽ�Ǽ�������������¼��</option>
                <option value="3">��Ƭ��ģ��������¼��</option>
                <option value="4">��Ƭ��ۼ��ߴ�ƫ����������¼��</option>
                <option value="5">��Ƭ������¼</option>
                <option value="6">��Ƭˮ������¼</option>
                <option value="7">�ֽ�Ǽܰ��Ʒ����¼</option>
                <option value="8">��������ֹ�˾��Ƭ����֤����</option>
                <option value="9">��Ƭ��©��¼</option>
                <option value="10">��������ע��¼</option>
                 <option value="11">ˮƽƴװ</option>
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